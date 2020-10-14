package com.spring.day16.dao;

import com.spring.day16.ds.Employee;
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

    @Autowired
    public void setDatasource(DataSource datasource){
        jdbcTemplate = new JdbcTemplate(datasource);
    }

    public List<Employee> findAllEmployee(){
        return  jdbcTemplate.query("select employeeId,name,age,hire_date,contact_email,contact_phone,salary from employee",
                                    this::mapRowEmployee);
    }

    public void saveEmployee(Employee employee){
        if(employee.getEmployeeId() < 0)
            throw  new IllegalStateException("EmployeeId has to be grater than zero");
        int numberOfInserted = jdbcTemplate.update("insert into employee (employeeId,name,age,hire_date,contact_email,contact_phone,salary) values (?,?,?,?,?,?,?)",
                employee.getEmployeeId(),
                employee.getName(),
                employee.getAge(),
                employee.getHire_date(),
                employee.getContact_email(),
                employee.getContact_phone(),
                employee.getSalary()
        );

        if(numberOfInserted == 1)
            System.out.println(String.format("Saved Employee = [%d]",employee.getEmployeeId()));
        else
            throw  new IllegalStateException(String.format("Expected 1 record to be inserted, instead retrived [%d] number of record inserted",numberOfInserted));
    }

    public void deleteAllEmployee(){
     int numberOfDeletedRow = jdbcTemplate.update("delete  from employee");
        System.out.println(String.format("Deleted, number of deleted row = [%d]",numberOfDeletedRow));
    }
@SneakyThrows
    public Employee mapRowEmployee(ResultSet resultSet, int rowNumber){
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
