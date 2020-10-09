package com.example.jdbctemplatecallbacks;

import com.example.jdbctemplatecallbacks.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateCallbacksApplication implements CommandLineRunner {

    private EmployeeService employeeService;

    public JdbcTemplateCallbacksApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateCallbacksApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.generateEmployeeData();
    }
}
