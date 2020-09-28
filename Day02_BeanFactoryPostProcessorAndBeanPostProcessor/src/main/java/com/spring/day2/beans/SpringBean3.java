package com.spring.day2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean3 {

    public SpringBean3(){
        System.out.println(getClass().getSimpleName() + ":: Constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println(getClass().getSimpleName() + ":: Init");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println(getClass().getSimpleName() + ":: Pre Destroy");
    }

}
