package com.spring.day12.service.a;

import com.spring.day12.ds.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void findAndUpdateEmployee(long id, Employee employeeMarge);
    void deleteByEmail(String email);
}
