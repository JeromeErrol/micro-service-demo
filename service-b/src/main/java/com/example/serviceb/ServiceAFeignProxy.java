package com.example.serviceb;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a", url = "localhost:8000")
public interface ServiceAFeignProxy {
    @GetMapping("/hello")
    String hello();
}
