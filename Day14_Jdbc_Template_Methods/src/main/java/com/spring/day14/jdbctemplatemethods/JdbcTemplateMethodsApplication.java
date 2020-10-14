package com.spring.day14.jdbctemplatemethods;

import com.spring.day14.jdbctemplatemethods.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateMethodsApplication implements CommandLineRunner {
    private EmployeeService employeeService;

    public JdbcTemplateMethodsApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateMethodsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       employeeService.generateEmployeeData();
    }
}
