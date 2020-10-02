package com.spring.day10.aop;

import com.spring.day10.aop.action.ComplexReportAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        ComplexReportAction action = context.getBean(ComplexReportAction.class);
        action.perform();
    }
}
