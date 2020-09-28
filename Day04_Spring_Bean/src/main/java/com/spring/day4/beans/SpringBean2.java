package com.spring.day4.beans;


public class SpringBean2 {

    public void destroy(){
        System.out.println(getClass().getSimpleName() + " :: Destroys");
    }
}
