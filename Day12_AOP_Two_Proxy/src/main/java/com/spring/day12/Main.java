package com.spring.day12;

import com.spring.day12.ds.Employee;
import com.spring.day12.service.a.EmployeeRepository;
import com.spring.day12.service.b.AlternateEmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        AlternateEmployeeRepository alternateEmployeeRepository = context.getBean(AlternateEmployeeRepository.class);
        SamePackageEmployeeRepository samePackageEmployeeRepository = context.getBean(SamePackageEmployeeRepository.class);

        employeeRepository.findEmployeeById(3);
        employeeRepository.saveEmployee(new Employee());
        employeeRepository.deleteEmployee(new Employee());
        employeeRepository.findAndUpdateEmployee(4, new Employee());

        Method deleteByEmail = employeeRepository.getClass().getDeclaredMethod("deleteByEmail", String.class);
        deleteByEmail.setAccessible(true);
        deleteByEmail.invoke(employeeRepository, "zinko.dev.info@gmail.com");


        alternateEmployeeRepository.findEmployeeById(5);
        alternateEmployeeRepository.saveEmployee(new Employee());
        alternateEmployeeRepository.deleteEmployee(new Employee());
        alternateEmployeeRepository.findAndUpdate(3, new Employee());

        samePackageEmployeeRepository.deleteEmployeeByEmail("zinko.dev.info@gmailcom");
        samePackageEmployeeRepository.deleteEmployee(4);
        samePackageEmployeeRepository.saveEmployee(new Employee());

        Method deletePhone = samePackageEmployeeRepository.getClass().getDeclaredMethod("deleteEmployeeByPhone", String.class);
        deletePhone.setAccessible(true);
        deletePhone.invoke(samePackageEmployeeRepository, "0977777989");
    }

}
