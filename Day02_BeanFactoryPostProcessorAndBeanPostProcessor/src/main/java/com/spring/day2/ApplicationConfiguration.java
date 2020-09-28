package com.spring.day2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {
    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor(){
        return  new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor(){
        return  new CustomBeanPostProcessor();
    }
}
