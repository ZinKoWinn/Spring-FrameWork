package com.spring.day10.service;

import com.spring.day10.annotation.InTransaction;
import com.spring.day10.ds.CurrencyId;
import org.springframework.stereotype.Component;

@Component("currency_service")
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from,String to){
        return 0F;
    }
    public float getExchangeRate(String from,String to,int multiplier){
        return 0F;
    }

    public String getCurrencyCountryName(CurrencyId currencyId){
        if(currencyId == CurrencyId.USD){
            return "USA";
        }
        else{
            throw new IllegalArgumentException("test");
        }
    }
}