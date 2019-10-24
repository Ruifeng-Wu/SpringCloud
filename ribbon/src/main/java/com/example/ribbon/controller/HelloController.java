package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.hello(name);
    }

    @Bean
    @LoadBalanced
        //负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
