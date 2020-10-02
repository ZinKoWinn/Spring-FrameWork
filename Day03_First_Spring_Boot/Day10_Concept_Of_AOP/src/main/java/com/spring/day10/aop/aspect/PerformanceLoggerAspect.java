package com.spring.day10.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.logging.Logger;
@Aspect
@Component
public class PerformanceLoggerAspect {
    private Logger logger = Logger.getLogger("performance.logger");
  @Around("@annotation(com.spring.day10.aop.annotation.PerformanceLogger)")
    public Object logPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        try {
            return proceedingJoinPoint.proceed();
        }finally {
            long finishTime = System.currentTimeMillis();
            Duration duration = Duration.ofMillis(finishTime-startTime);
            logger.info(String.format("Duration of %s execution was %s",proceedingJoinPoint.getSignature(),duration));
        }
    }
}
