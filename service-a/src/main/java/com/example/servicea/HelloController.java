package com.example.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/hello")
    public String hello() {
        return configuration.getMessage();
    }
}
