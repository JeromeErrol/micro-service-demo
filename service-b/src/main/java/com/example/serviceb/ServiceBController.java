package com.example.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Autowired
    private ServiceB serviceB;

    @GetMapping("/hello")
    public String hello(){
        return "service b call a and received : " + serviceB.getServiceAMessage();
    }
}
