package com.spring.day3;

import com.spring.day3.beans.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public SpringBean1 springBean1(){
        return  new SpringBean1();
    }
}
