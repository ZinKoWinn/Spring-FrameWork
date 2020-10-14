package com.spring.day14.jdbctemplatemethods.service;

import com.spring.day14.jdbctemplatemethods.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void printReport() {
        System.out.println("Employee Report Start");
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Employee Report End");
    }
    @Transactional
    public void printReportInTransaction(){
        System.out.println("Employee Report Start - Transaction");
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Find Employee Count : " + employeeDao.findEmployeeCount());
        System.out.println("Employee Report End");
    }
}
