package com.spring.day11.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlternativeCurrenciesRepositoryAspect {
   // @Before("this(com.spring.day11.bls.AlternativeCurrenciesRepository)")
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before - this(beforeThisCurrenciesRepository)");
    }

   // @Before("target(com.spring.day11.bls.AlternativeCurrenciesRepository)")
    public  void beforeTargetCurrenciesRepository(){
        System.out.println("Before - target(beforeTargetCurrenciesRepository)");
    }
}
