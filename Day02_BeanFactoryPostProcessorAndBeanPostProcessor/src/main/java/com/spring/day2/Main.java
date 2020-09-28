package com.spring.day2;

import com.spring.day2.ApplicationConfiguration;
import com.spring.day2.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
            SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        }
    }
}
