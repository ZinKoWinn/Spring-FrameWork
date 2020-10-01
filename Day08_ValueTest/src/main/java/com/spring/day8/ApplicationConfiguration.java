package com.spring.day8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@ComponentScan
@Configuration
@PropertySource("application.properties")
public class ApplicationConfiguration {
    @Bean
    public ConversionService conversionService(){
        return new DefaultConversionService();
    }
}
