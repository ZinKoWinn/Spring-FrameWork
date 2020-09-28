package com.spring.day4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SpringBean4 {

    public SpringBean4(){
        System.out.println("Creating " + getClass().getSimpleName() + " Lazy Singleton Bean");
    }


}
