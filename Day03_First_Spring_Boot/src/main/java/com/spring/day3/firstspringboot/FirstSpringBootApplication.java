package com.spring.day3.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.stream.Stream;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {

      ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
        Stream.of(context.getBeanDefinitionNames()).sorted().forEach(System.out::println);
    }

}
