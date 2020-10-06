package com.spring.day12.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeRepositoryAspect {

   // @Before("execution(* com.spring.day12.service.a.EmployeeRepository.findEmployeeById(..))")
    public void beforeFindEmployeeById() {
        System.out.println("Service A - beforeFindEmployeeById()");
    }

    //@After("within(com.spring.day12.service.a.*)")
    public void afterExecutionWithPackage() {
        System.out.println("Service A - afterExecutionWithPackage()");
    }
  @Pointcut("within(com.spring.day12.service.*.*) || within(com.spring.day12.*)")
    public void serviceOrSamePackageRepository(){

    }
    @Before("serviceOrSamePackageRepository()")
    public  void before(JoinPoint joinPoint){
        System.out.println("Before - " + joinPoint.getSignature());
    }
  @After("serviceOrSamePackageRepository()")
    public void after(JoinPoint joinPoint){
        System.out.println("After - "+ joinPoint.getSignature());
    }



}
