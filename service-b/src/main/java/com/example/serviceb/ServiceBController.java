package com.example.serviceb;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Autowired
    private ServiceA serviceA;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){
        return "service-b called service-a and received : " + serviceA.hello();
    }

    public String helloFallback(){
        return "service-b could not reach service-a";
    }
}
