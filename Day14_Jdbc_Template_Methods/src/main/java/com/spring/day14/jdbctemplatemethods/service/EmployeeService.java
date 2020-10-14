package com.spring.day14.jdbctemplatemethods.service;

import com.spring.day14.jdbctemplatemethods.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void generateEmployeeData() {
        System.out.println("Employee List Is Start");
        System.out.println("Employee List .......");
        employeeDao.findAll().forEach(System.out::println);

        System.out.println("Employee Name........");
        employeeDao.findName().forEach(System.out::println);

        System.out.println("Find Employee High Salary......");
        System.out.println(employeeDao.findEmployeeHighSalary());

        System.out.println("Find Employee By Id......");
        System.out.println(employeeDao.findEmployeeById(2));

        System.out.println("Find Employee That Was Hired Last.....");
        System.out.println(employeeDao.findEmployeeThatWasHiredLast());

        System.out.println("Find Email and Phone With sqlRowSet.....");
        System.out.println(employeeDao.findContactEmailAndPhone());

        System.out.println("Insert into Database.....");
        employeeDao.insertData();

        System.out.println("Find Employee Data By Id ");
        System.out.println(employeeDao.findEmployeeById(3));

        System.out.println("Update into Database....");
        System.out.println("Updated data " + employeeDao.updateData("Ko Zin Ko",3));

        System.out.println("Find Employee Data By Id ");
        System.out.println(employeeDao.findEmployeeById(3));
        System.out.println("Employee List Is End");
    }
}
