package com.example.eureka.client.copy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello "+name+", I am from port: " +port;
    }
}
