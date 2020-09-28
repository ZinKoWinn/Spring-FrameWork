package com.spring.day3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name = "Zin Ko Winn";
    private  Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public void setAddress(Address address){
        this.address = address;
    }

    public String showInfo(){
        return  name + " : " + address.getStreetName();
    }
}
