package com.spring.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**

 Java Based

 **/



public class Main3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Applicationconfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student.showInfo());
    }
}
