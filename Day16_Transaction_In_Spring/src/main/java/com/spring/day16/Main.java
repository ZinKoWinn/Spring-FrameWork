package com.spring.day16;

import com.spring.day16.configuration.DataSourceConfiguration;
import com.spring.day16.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        try {
            employeeService.saveEmployeeWithoutTransaction();
        } catch (Exception exception) {
            System.out.println("Exception,during saving employee " + exception.getMessage());
        }
        employeeService.printEmployees();
        employeeService.deleteEmployee();

        try {
            employeeService.saveEmployeeWithTransaction();
        } catch (Exception exception) {
            System.out.println("Exception,during saving employee " + exception.getMessage());
        }


        employeeService.printEmployees();
        employeeService.deleteEmployee();

    }
}
