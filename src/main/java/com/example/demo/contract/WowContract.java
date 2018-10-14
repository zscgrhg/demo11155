package com.example.demo.contract;

import com.zte.crm.framework.contract.annotation.Contract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Contract
public interface WowContract {
    @GetMapping("/wow/{name}")
    String wow(@PathVariable("name") String name);
}
