package com.spring.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student",Student.class);
         //Student student = new Student();
        System.out.println(student.showInfo());
    }
}
