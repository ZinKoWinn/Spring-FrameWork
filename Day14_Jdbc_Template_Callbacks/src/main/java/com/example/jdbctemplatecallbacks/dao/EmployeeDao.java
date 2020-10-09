package com.example.jdbctemplatecallbacks.dao;

import com.example.jdbctemplatecallbacks.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee",
                new RowMapper<Employee>() {
                    @Override
                    public Employee mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
                        return new Employee(
                                resultSet.getInt("employeeId"),
                                resultSet.getString("name"),
                                resultSet.getInt("age"),
                                resultSet.getDate("hire_date"),
                                resultSet.getString("contact_email"),
                                resultSet.getString("contact_phone"),
                                resultSet.getInt("salary")

                        );
                    }
                }        );
    }

    public List<Employee> findAllWithStreamLambda(){
        return  null;
    }

    public int findAverageSalaryWithRowByRow() {
        AverageSalaryRowCallBackHandler averageSalaryRowCallBackHandler = new AverageSalaryRowCallBackHandler();
        jdbcTemplate.query("select salary from employee", averageSalaryRowCallBackHandler);
        return averageSalaryRowCallBackHandler.averageSalary();
    }
    private static class AverageSalaryRowCallBackHandler implements RowCallbackHandler {
        private int salarySum = 0;
        private int salaryCount = 0;

        @Override
        public void processRow(ResultSet resultSet) throws SQLException {
            salarySum += resultSet.getInt("salary");
            ++salaryCount;

        }

        public int averageSalary() {
            return salarySum / salaryCount;
        }
    }

    public int findAverageSalaryWithResultSetExtractor() {
        return jdbcTemplate.query("select salary from employee", new AverageSalaryResultSetExtractor());
    }

    public static class AverageSalaryResultSetExtractor implements ResultSetExtractor<Integer> {

        @Override
        public Integer extractData(ResultSet resultSet) throws SQLException, DataAccessException {
            int salarySum = 0;
            int salaryCount = 0;
            while (resultSet.next()) {
                salarySum += resultSet.getInt("salary");
                ++salaryCount;
            }
            return salarySum / salaryCount;
        }
    }

    public double findAverageSalaryWithModernImplementation() {
        return jdbcTemplate.queryForList("select salary from employee", Double.class)
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0F);
    }

    public float findAverageSalaryWithSqlLevel() {
        return jdbcTemplate.queryForObject("select avg(salary) from employee", Float.class);
    }

    public String findEmployeeEmailWithPreparedStatement(String name) {
        return jdbcTemplate.query(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        return connection.prepareStatement("select contact_email from employee where name = ?");
                    }
                },

                new PreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, name);
                    }
                },

                new ResultSetExtractor<String>() {

                    @Override
                    public String extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        if (resultSet.next())
                            return resultSet.getString("contact_email");
                        else
                            throw new SQLException("Contact Email Not Found");
                    }
                }
        );
    }


}







