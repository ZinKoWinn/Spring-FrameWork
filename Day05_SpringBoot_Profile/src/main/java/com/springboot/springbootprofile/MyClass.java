package com.springboot.springbootprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component

public class MyClass {
    @Value("${app.name}")
    private  String name;

    public String getName() {
        return name;
    }

    public String showProfile(){
        return  name;
    }
}
