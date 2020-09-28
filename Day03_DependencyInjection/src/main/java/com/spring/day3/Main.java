package com.spring.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**

 XMl Based

 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        Student student = context.getBean("student",Student.class);
        student.getName();
        student.setAddress(new Address());
        System.out.println(student.showInfo());

        ((FileSystemXmlApplicationContext)context).close();
    }
}
