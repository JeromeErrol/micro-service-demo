package com.example.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceB {

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private ServiceAFeignProxy feignProxy;

    public String getServiceAMessage() {
        return feignProxy.hello();
    }
}
