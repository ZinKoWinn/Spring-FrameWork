package com.example.jdbctemplatecallbacks.service;

import com.example.jdbctemplatecallbacks.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void generateEmployeeData() {
        System.out.println("Employee List Is Start");
        System.out.println("Employee List......");
        employeeDao.findAll().forEach(System.out::println);

        System.out.println("Average Salary Of Employee Calculated  With Row By Row ");
        System.out.println(employeeDao.findAverageSalaryWithRowByRow());

        System.out.println("Average Salary Of Employee Calculated With ResultSetExtractor");
        System.out.println(employeeDao.findAverageSalaryWithResultSetExtractor());

        System.out.println("Average Salary Of Employee  Calculated With ModernImplementation ");
        System.out.println(employeeDao.findAverageSalaryWithModernImplementation());

        System.out.println("Average Salary Of Employee Calculated With SqlLevel");
        System.out.println(employeeDao.findAverageSalaryWithSqlLevel());

        System.out.println("Contact Email Of Employee Searched With Employee Name");
        System.out.println(employeeDao.findEmployeeEmailWithPreparedStatement("Zin Ko Winn"));
        System.out.println("Employee List Is End");
    }
}
