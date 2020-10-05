package com.spring.day11.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CurrenciesRepositoryAspect {
  //  @Before("this(com.spring.day11.bls.CurrenciesRepository)")
    public void beforeThsCurrenciesRepository(){
        System.out.println("Before - this(CurrenciesRepositoryIml)");
    }

   // @Before("target(com.spring.day11.bls.CurrenciesRepositoryIml)")
    public  void beforeTargetCurrenciesRepository(){
        System.out.println("Before - target(CurrenciesRepositoryIml)");
    }
}
