package com.spring.day14.jdbctemplatemethods.dao;

import com.spring.day14.jdbctemplatemethods.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void setDataSource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Employee> findAll(){
        return  jdbcTemplate.query("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee",
                                   this::mapRowEmployee);
    }

    public List<String> findName(){
        return  jdbcTemplate.queryForList("select name from employee",String.class);
    }

    public Employee findEmployeeHighSalary(){
        return  jdbcTemplate.queryForObject("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee  order by salary desc limit 1",
                                            this::mapRowEmployee);
    }

    public Employee findEmployeeById(int id){
        return  jdbcTemplate.queryForObject("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee where employeeId = ?",
                new Object[]{id},
                this::mapRowEmployee);
    }

    public Map<String,Object> findEmployeeThatWasHiredLast(){
        return jdbcTemplate.queryForMap("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee order by hire_date limit 1");
    }

    public SqlRowSet findContactEmailAndPhone(){
        return  jdbcTemplate.queryForRowSet("select  contact_email,contact_phone from employee");
    }

    public void insertData(){
        jdbcTemplate.execute("insert into employee values (3,'Shan Lay',19,'2019-03-18','shanlay.tg@gmail.com','09456078901',100000)");
    }

    public int updateData(String name,int id){
        return jdbcTemplate.update("update employee set name = ? where employeeId = ?",
                            new Object[]{name,id}
                );
    }
    @SneakyThrows
    public Employee mapRowEmployee(ResultSet resultSet,int rowNum){
        return  new Employee(
                resultSet.getInt("employeeId"),
                resultSet.getString("name"),
                resultSet.getInt("age"),
                resultSet.getDate("hire_date"),
                resultSet.getString("contact_email"),
                resultSet.getString("contact_phone"),
                resultSet.getInt("salary")
        );
    }
}
