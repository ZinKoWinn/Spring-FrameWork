package com.spring.day3;

import com.spring.day3.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
            SpringBean1 springBean1 = context.getBean(SpringBean1.class);
            System.out.println(springBean1.sayGreet("Shan Lay"));
        }
    }
}
