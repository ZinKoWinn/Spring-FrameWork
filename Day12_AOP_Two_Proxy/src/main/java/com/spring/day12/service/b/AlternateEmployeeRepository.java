package com.spring.day12.service.b;

import com.spring.day12.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class AlternateEmployeeRepository {
    public Employee findEmployeeById(long id){
        return  new Employee();
    }

    public void saveEmployee(Employee employee){

    }

    public void deleteEmployee(Employee employee){

    }

    public void findAndUpdate(long id,Employee employeeToMerge){
        Employee employeeId = findEmployeeById(id);
        saveEmployee(employeeId);

    }
}
