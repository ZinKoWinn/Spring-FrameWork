package com.spring.day7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.goQuest());

    }
}
