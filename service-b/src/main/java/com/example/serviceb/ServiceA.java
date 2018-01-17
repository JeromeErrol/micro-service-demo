package com.example.serviceb;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a")
@RibbonClient(name = "service-a")
public interface ServiceA {
    @GetMapping("/hello")
    String hello();
}
