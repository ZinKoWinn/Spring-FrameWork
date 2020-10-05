package com.spring.day11.bls;

import com.spring.day11.annotation.InTransaction;
import com.spring.day11.annotation.Secured;
import com.spring.day11.annotation.Validated;
import com.spring.day11.ds.CurrencyId;
import org.springframework.stereotype.Component;

@Component("currency_service")
@Secured
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from, String to) {
        return 0F;
    }

    public float getExchangeRate(String from, String to, int multiplier) {
        return 0F;
    }

    public String getCurrencyLongName(@Validated CurrencyId currencyId) {
        return null;
    }

    public String getCurrencyCountryName(CurrencyId currencyId) {
        if (currencyId == CurrencyId.MMK) {
            return "Myanmar";
        } else {
            throw new IllegalArgumentException("Test");
        }
    }
}
