package com.spring.day7;

import com.spring.day7.annotation.Dismel;
import com.spring.day7.annotation.Dragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight {
    @Autowired @Dismel
    private  Quest quest;

    public String goQuest() {
       return  quest.goQuest();
    }
}
