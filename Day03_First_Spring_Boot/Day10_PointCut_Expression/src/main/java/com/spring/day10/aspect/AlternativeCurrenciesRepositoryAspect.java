package com.spring.day10.aspect;

import com.spring.day10.annotation.InTransaction;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlternativeCurrenciesRepositoryAspect {
    @Before("this(com.spring.day10.bls.AlternativeCurrenciesRepository)")
    public  void  beforeThisCurrencyRepository(){
        System.out.println("Before - this(AlternativeCurrenciesRepositoryAspect)");
    }

    @Before("target(com.spring.day10.bls.AlternativeCurrenciesRepository)")
    public  void  beforeTargetCurrencyRepository(){
        System.out.println("Before - target(AlternativeCurrenciesRepositoryAspect)");
    }
}
