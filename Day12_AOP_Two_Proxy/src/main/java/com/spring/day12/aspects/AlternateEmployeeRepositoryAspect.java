package com.spring.day12.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlternateEmployeeRepositoryAspect {
    @Before("execution(* com.spring.day12.service.b.AlternateEmployeeRepository.findEmployeeById(..))")
    public void beforeFindEmployeeById(){
        System.out.println("Service B - beforeFindEmployeeById()");
    }
    @After("within(com.spring.day12.service.b.*)")
    public void afterExecutionWithinPackage(){
        System.out.println("Service B - afterExecutionWithinPackage()");
    }
}
