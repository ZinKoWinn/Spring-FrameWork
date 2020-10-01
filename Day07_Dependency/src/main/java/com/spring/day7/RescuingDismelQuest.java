package com.spring.day7;

import com.spring.day7.annotation.Dismel;
import org.springframework.stereotype.Component;

@Component @Dismel
public class RescuingDismelQuest implements Quest{

    @Override
    public String goQuest() {
    return "Knight is going to rescue Dimsel";
    }
}
