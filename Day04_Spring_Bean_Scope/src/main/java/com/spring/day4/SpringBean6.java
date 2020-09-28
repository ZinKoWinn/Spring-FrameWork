package com.spring.day4;

import org.springframework.stereotype.Component;

@Component
public class SpringBean6 {

    public SpringBean6(){
        System.out.println("Creating " + getClass().getSimpleName() + " Prototype Bean that referenced from singleton bean" +
                " : SpringBean5");
    }
}
