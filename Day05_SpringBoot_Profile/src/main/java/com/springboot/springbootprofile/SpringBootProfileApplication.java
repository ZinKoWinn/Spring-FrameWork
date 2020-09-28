package com.springboot.springbootprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProfileApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootProfileApplication.class, args);
        MyClass myClass = context.getBean(MyClass.class);
        System.out.println(myClass.showProfile());
    }

}
