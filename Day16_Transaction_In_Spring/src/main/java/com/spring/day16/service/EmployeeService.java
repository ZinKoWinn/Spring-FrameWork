package com.spring.day16.service;

import com.spring.day16.dao.EmployeeDao;
import com.spring.day16.ds.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void printEmployees() {
        System.out.println("Printing all employees");
        employeeDao.findAllEmployee().forEach(System.out::println);
    }

    public void deleteEmployee() {
        System.out.println("Deleting all employee");
        employeeDao.deleteAllEmployee();
    }

    public void saveEmployeeWithoutTransaction() {
        System.out.println("Saving employees without transaction");
        saveEmployees();
    }

    @Transactional
    public void saveEmployeeWithTransaction() {
        System.out.println("Saving employees with transaction");
        saveEmployees();
    }

    public void saveEmployees() {
        employeeDao.saveEmployee(new Employee(1, "Zin KO Winn", 18, Date.valueOf("2020-07-23"), "zinko.developer@gmail.com", "09797256920", 300000));
        employeeDao.saveEmployee(new Employee(2, "Shan Lay", 15, Date.valueOf("2020-06-13"), "shanlay.developer@gmail.com", "09797256920", 250000));
        employeeDao.saveEmployee(new Employee(3, "Nyi Pu", 23, Date.valueOf("2020-03-13"), "nyipu.developer@gmail.com", "09797256920", 250000));
        employeeDao.saveEmployee(new Employee(4, "Coin Kyut Kyan", 19, Date.valueOf("2020-05-13"), "coingyi.developer@gmail.com", "09797256920", 250000));

    }
}
