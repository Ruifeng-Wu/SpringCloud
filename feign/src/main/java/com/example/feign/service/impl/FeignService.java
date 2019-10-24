package com.example.feign.service.impl;

import com.example.feign.service.FeignInterface;
import org.springframework.stereotype.Service;

@Service
public class FeignService implements FeignInterface {
    @Override
    public String sayHelloFromClient(String name) {
        return "Sorry, "+name;
    }
}
