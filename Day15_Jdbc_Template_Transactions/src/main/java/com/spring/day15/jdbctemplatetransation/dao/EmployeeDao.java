package com.spring.day15.jdbctemplatetransation.dao;


import com.spring.day15.jdbctemplatetransation.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;
@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Employee> findAllEmployees() {
        return jdbcTemplate.query("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee",
                this::rowMapEmployee);
    }

    public void deleteALlEmployee() {
        int numberOfDeletedRow = jdbcTemplate.update("delete  from employee");
        System.out.println(String.format("Employee deleted, number of deleted row from = [%d] ", numberOfDeletedRow));
    }

    public void saveEmployee(Employee employee) {
        if (employee.getEmployeeId() < 0)
            throw new IllegalArgumentException("EmployeeId has to be grater than zero");
        int numberOfRecordInserted = jdbcTemplate.update("insert into employee (employeeId,name,age,hire_date,contact_email,contact_phone,salary) values (?,?,?,?,?,?,?)",
                employee.getEmployeeId(),
                employee.getName(),
                employee.getAge(),
                employee.getHire_date(),
                employee.getContact_email(),
                employee.getContact_phone(),
                employee.getSalary());
        if(numberOfRecordInserted == 1)
            System.out.println(String.format("Saved Employee = [%d]",employee.getEmployeeId()));
        else
            throw  new IllegalStateException(String.format("Expected 1 record to be inserted, instead retrived [%d] number of record inserted",numberOfRecordInserted));

    }

    @SneakyThrows
    public Employee rowMapEmployee(ResultSet resultSet, int rowNum) {
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
}
