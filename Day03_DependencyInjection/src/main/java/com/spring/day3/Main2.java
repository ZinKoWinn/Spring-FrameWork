package com.spring.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**

  Annotation Based

* */


public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Student student = context.getBean(Student.class);
        System.out.println(student.showInfo());
    }
}
