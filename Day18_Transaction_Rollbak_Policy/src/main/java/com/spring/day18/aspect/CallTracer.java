package com.spring.day18.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CallTracer {
    @Pointcut("within(com..service.*)")
    public void callTracerPointCuts() {

    }

    @Around("callTracerPointCuts()")
    public Object callTrace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object returnValue = null;
        String name = proceedingJoinPoint.getSignature().getName();
        try {
            System.out.println("Starting " + name);
            returnValue = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println(String.format("Exception thrown in %s : %s", name, throwable.getMessage()));
        }
        System.out.println("Completed " + name);
        return returnValue;
    }

}
