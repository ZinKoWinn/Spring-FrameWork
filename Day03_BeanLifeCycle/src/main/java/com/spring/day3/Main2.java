package com.spring.day3;

import com.spring.day3.ApplicationConfiguration;
import com.spring.day3.beans.SpringBean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();
        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        System.out.println(springBean1.sayGreet("Khin Suu Suu Nwe"));
    }


}
