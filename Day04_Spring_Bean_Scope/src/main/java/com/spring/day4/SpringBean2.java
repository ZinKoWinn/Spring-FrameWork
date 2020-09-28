package com.spring.day4;

import org.springframework.stereotype.Component;

/*

  The default scope of spring beans are singleton. If the scope is singleton, container will create exactly
  one instance of the object. Even if we don't requested a programmatic getBean() method call on container,
  container can create singleton bean  object automatically .

 */

@Component
public class SpringBean2 {
    public SpringBean2(){
        System.out.println("Creating " + getClass().getSimpleName() + " Singleton Bean");
    }
}
