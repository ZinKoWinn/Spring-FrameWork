package com.spring.day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Applicationconfig {

    @Bean
    public Student student(){
        Student student = new Student();
        student.setAddress(address());
        return  student;
    }
    @Bean
    public Address address(){
        return new Address();
    }
}
