package com.spring.day4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class ApplicationConfiguration {
@Bean
public SpringBean7 springBean7(){
    return  new SpringBean7();
}
@Bean
public SpringBean8 springBean8(){
    return new SpringBean8();
}

}
