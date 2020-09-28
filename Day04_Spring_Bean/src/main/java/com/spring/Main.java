package com.spring;

import com.spring.day4.beans.ApplicationConfiguration;
import com.spring.day4.beans.SpringBean1;
import com.spring.day4.beans.SpringBean2;
import com.spring.day4.beans.SpringBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        springBean1.printDependency();
    }
}
