package com.spring.day10;

import com.spring.day10.bls.AlternativeCurrenciesRepository;
import com.spring.day10.bls.CurrenciesRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        //AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);
      //  alternativeCurrenciesRepository.getCurrencyCount();

        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        currenciesRepository.getCurrencyCount();
    }
}
