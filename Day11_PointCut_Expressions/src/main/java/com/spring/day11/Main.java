package com.spring.day11;

import com.spring.day11.bls.AlternativeCurrenciesRepository;
import com.spring.day11.bls.CurrenciesRepository;
import com.spring.day11.bls.CurrencyService;
import com.spring.day11.ds.CurrencyId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);
        alternativeCurrenciesRepository.getCurrencyCount();

        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        currenciesRepository.getCurrencyCount();

        CurrencyService currencyService = context.getBean(CurrencyService.class);
        currencyService.getExchangeRate("USD","MMK");
        currencyService.getExchangeRate("MMK","USD",5);
        currencyService.getCurrencyLongName(CurrencyId.MMK);
        try {
            currencyService.getCurrencyCountryName(CurrencyId.MMK);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
