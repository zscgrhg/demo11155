package com.example.ps;


import com.zte.crm.framework.contract.annotation.Producers;
import org.springframework.stereotype.Component;


@Component
@Producers
public class HelloProvider implements HelloContract {

    public String hello(String name) {
        return "welcome " + name;
    }


}
