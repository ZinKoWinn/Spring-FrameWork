package com.spring.day10.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CacheLoggerAspect {

    private Logger logger = Logger.getLogger("cache.logger");

 @Around("@annotation(com.spring.day10.aop.annotation.CacheableLogger)")
    public Object checkCache(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        logger.info(proceedingJoinPoint.getSignature() + "Cache Aspect Started");
        try {
            return  proceedingJoinPoint.proceed();
        }finally {
            logger.info(proceedingJoinPoint.getSignature() + "Cache Aspect End");

        }
    }

}
