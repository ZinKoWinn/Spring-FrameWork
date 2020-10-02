package com.spring.day10.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CurrenciesRepositoryAspect {
    @Before("this(com.spring.day10.bls.CurrenciesRepository)")
    public  void beforeThisCurrencyRepository(){
        System.out.println("Before - this(CurrenciesRepositoryIml)");
    }

    @Before("target(com.spring.day10.bls.CurrenciesRepositoryIml)")
    public  void beforeTargetCurrencyRepository(){
        System.out.println("Before - target(CurrenciesRepositoryIml)");
    }
}
