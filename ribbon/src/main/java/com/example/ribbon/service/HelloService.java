package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    private final RestTemplate restTemplate;

    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//  启用熔断
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://SERVICE-EUREKA-CLIENT/hello?name=" + name, String.class);
    }

    public String helloError(String name){
        return "Hello "+name+", this is error!";
    }
}

