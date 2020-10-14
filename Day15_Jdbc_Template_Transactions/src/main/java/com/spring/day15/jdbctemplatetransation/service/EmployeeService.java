package com.spring.day15.jdbctemplatetransation.service;

import com.spring.day15.jdbctemplatetransation.dao.EmployeeDao;
import com.spring.day15.jdbctemplatetransation.ds.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void printEmployeeData() {
        System.out.println("Printing Employees List......");
        employeeDao.findAllEmployees().forEach(System.out::println);
    }

    public void deleteAllEmployee() {
        System.out.println("Deleting All Employees");
        employeeDao.deleteALlEmployee();
    }

    @Transactional
    public void saveEmployeeWithTransaction() {
        System.out.println("Saving Employee With Transaction");
        saveEmployee();
    }

    public void saveEmployeeWithoutTransaction() {
        System.out.println("Savin Employee Without Transaction");
        saveEmployee();
    }

    public void saveEmployee() {
        employeeDao.saveEmployee(new Employee(1, "Zin Ko Winn", 18, Date.valueOf("2020-10-13"), "zinko.developer@gmail.com", "09797256920", 250000));
        employeeDao.saveEmployee(new Employee(2, "Shan Lay", 15, Date.valueOf("2020-06-13"), "shanlay.developer@gmail.com", "09797256920", 250000));
        employeeDao.saveEmployee(new Employee(-1, "Nyi Pu", 23, Date.valueOf("2020-03-13"), "nyipu.developer@gmail.com", "09797256920", 250000));
        employeeDao.saveEmployee(new Employee(4, "Coin Kyut Kyan", 19, Date.valueOf("2020-05-13"), "coingyi.developer@gmail.com", "09797256920", 250000));
    }
}
