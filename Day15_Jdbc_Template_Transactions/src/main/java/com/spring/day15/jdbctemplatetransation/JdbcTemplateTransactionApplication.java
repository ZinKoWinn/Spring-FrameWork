package com.spring.day15.jdbctemplatetransation;

import com.spring.day15.jdbctemplatetransation.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class JdbcTemplateTransactionApplication implements CommandLineRunner {
    private final EmployeeService employeeService;

    public JdbcTemplateTransactionApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateTransactionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            employeeService.saveEmployeeWithoutTransaction();
        }catch (Exception e){
            System.out.println("Exception, during saving employees " + e.getMessage());
        }
        employeeService.printEmployeeData();
        employeeService.deleteAllEmployee();
        try {
            employeeService.saveEmployeeWithTransaction();
        }catch (Exception e){
            System.out.println("Exception, during saving employees " + e.getMessage());
        }
        employeeService.printEmployeeData();
        employeeService.deleteAllEmployee();
    }
    }

