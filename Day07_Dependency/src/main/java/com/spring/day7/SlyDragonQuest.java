package com.spring.day7;

import com.spring.day7.annotation.Dragon;
import org.springframework.stereotype.Component;

@Component @Dragon
public class SlyDragonQuest implements Quest{
    @Override
    public String goQuest() {
        return  "Knight killed the dragon";
    }
}
