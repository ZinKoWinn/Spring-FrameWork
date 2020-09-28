package com.spring.day4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        SpringBean3 springBean3 = context.getBean(SpringBean3.class);
        SpringBean4 springBean4 = context.getBean(SpringBean4.class);

    }
}
