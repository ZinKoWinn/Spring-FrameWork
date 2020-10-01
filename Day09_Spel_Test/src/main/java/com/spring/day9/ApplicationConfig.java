package com.spring.day9;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
}
