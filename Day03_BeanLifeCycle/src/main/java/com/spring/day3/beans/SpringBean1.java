package com.spring.day3.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {
    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println(getClass().getSimpleName() + " :: Constructor");
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2){
        System.out.println(getClass().getSimpleName() + " :: setSpringBean2");
        this.springBean2 = springBean2;
    }
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct :: " + getClass().getSimpleName() + " :: Init");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestroy :: " + getClass().getSimpleName() + "::Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass().getSimpleName() + " :: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getClass().getSimpleName() + " :: destroy");
    }

    public void initMethod(){
        System.out.println("@Bean :: " + getClass().getSimpleName() + " :: InitMethod");
    }

    public void destroyMethod(){
        System.out.println("@Bean :: " + getClass().getSimpleName() + " :: DestroyMethod");
    }

    public String sayGreet(String name){
        return "Hello :: " + name;
    }


}
