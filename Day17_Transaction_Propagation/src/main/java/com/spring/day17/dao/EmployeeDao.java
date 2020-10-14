package com.spring.day17.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDao {
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredTransactionMethod() {
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiredNewTransactionMethod() {

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsTransactionMethod() {

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedTransactionMethod() {

    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryTransactionMethod() {

    }


    @Transactional(propagation = Propagation.NEVER)
    public void neverTransactionMethod() {

    }

    @Transactional(propagation = Propagation.NESTED)
    public void nestedTransactionMethod() {

    }
}
