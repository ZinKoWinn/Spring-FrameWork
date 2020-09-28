package com.spring.day3;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String streetName = "No.2,Zeya Minglar 1st street,1 Ward, Hlaing";

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
