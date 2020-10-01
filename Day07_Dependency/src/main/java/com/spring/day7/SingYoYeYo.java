package com.spring.day7;

import com.spring.day7.annotation.Sing;
import org.springframework.stereotype.Component;

@Component @Sing
public class SingYoYeYo implements  Quest{
    @Override
    public String goQuest() {
        return  "Knight sings 'Yo Ye Yo' happily";
    }
}
