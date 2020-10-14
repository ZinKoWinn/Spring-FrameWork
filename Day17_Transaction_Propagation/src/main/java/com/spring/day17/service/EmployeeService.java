package com.spring.day17.service;

import com.spring.day17.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void callRequiredWithoutCurrentTransaction() {
        employeeDao.requiredTransactionMethod();
    }

    @Transactional
    public void callRequiredWithCurrentTransaction() {
        employeeDao.requiredTransactionMethod();
    }

    public void callRequiredNewWithoutCurrentTransaction() {
        employeeDao.requiredNewTransactionMethod();
    }

    @Transactional
    public void callRequiredNewWithCurrentTransaction() {
        employeeDao.requiredNewTransactionMethod();
    }

    public void callSupportsWithoutCurrentTransaction() {
        employeeDao.supportsTransactionMethod();
    }

    @Transactional
    public void callSupportWithCurrentTransaction() {
        employeeDao.supportsTransactionMethod();
    }

    public void callNotSupportedWithoutCurrentTransaction() {
        employeeDao.notSupportedTransactionMethod();
    }

    @Transactional
    public void callNotSupportWithCurrentTransaction() {
        employeeDao.notSupportedTransactionMethod();
    }

    public void callNestedWithoutCurrentTransaction() {
        employeeDao.nestedTransactionMethod();
    }

    @Transactional
    public void callNestedWithCurrentTransaction() {
        employeeDao.nestedTransactionMethod();
    }

    public void callMandatoryWithoutCurrentTransaction() {
        employeeDao.mandatoryTransactionMethod();
    }

    @Transactional
    public void callMandatoryWithCurrentTransaction() {
        employeeDao.mandatoryTransactionMethod();
    }

    public void callNeverWithoutTransaction() {
        employeeDao.neverTransactionMethod();
    }

    @Transactional
    public void callNeverWithTransaction() {
        employeeDao.neverTransactionMethod();
    }
}
