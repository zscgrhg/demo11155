package com.example.demo.provider;

import com.example.demo.contract.HelloContract;
import com.example.demo.contract.WowContract;
import com.zte.crm.framework.contract.annotation.Producers;


@Producers
public class HelloProvider implements HelloContract, WowContract {
    @Override
    public String hello(String name) {
        return "welcome " + name;
    }


    @Override
    public String wow(String name) {
        return name+"  is coming";
    }
}
