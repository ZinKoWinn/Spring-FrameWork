package com.spring.day12.service.a;

import com.spring.day12.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryImpl implements  EmployeeRepository{
    @Override
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void findAndUpdateEmployee(long id, Employee employeeMarge) {
        Employee employeeId = findEmployeeById(id);
        saveEmployee(employeeMarge);
    }

    public  void deleteByEmail(String mail){

    }
}
