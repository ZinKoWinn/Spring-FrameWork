package com.spring.day9;

import com.spring.day9.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();
        context.register(ApplicationConfig.class);
        context.refresh();

        SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean.getAppFileProperty());
        System.out.println(springBean.getJavaHome());

        System.out.println(springBean.getAdditionalResult());
        System.out.println(springBean.getCityName());
        System.out.println(springBean.getCurrentDate());
        System.out.println(springBean.getJavaHomeSpel());
    }
}
