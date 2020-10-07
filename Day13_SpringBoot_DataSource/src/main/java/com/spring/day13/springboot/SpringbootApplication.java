package com.spring.day13.springboot;

import com.spring.day13.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
    private final  StudentService studentService;

    public SpringbootApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentService.printReportData();
    }
}
