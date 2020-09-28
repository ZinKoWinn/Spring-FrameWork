package com.spring.day4.beans;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    @Bean(initMethod = "init")
    public SpringBean1 springBean1(SpringBean2 springBean2,SpringBean3 SpringBean3A){
        return  new SpringBean1(springBean2,SpringBean3A);
    }
    @Bean(destroyMethod =  "destroy")
    public SpringBean2 springBean2(){
        return  new SpringBean2();
    }

   @Bean
    public SpringBean3 springBean3(){
        return  new SpringBean3C();
    }

    @Bean
    public MessageDigest messageDigest(){
        return DigestUtils.getSha256Digest();
    }

    @Bean(name = "SpringBean3A")
    public SpringBean3 springBean3A(MessageDigest messageDigest){
        return new SpringBean3A(messageDigest);
    }

    @Bean(name = {"SpringBean3B","SpringBeanThreeB"})
    public SpringBean3 springBean3B(){
        return  new SpringBean3B();
    }
}
