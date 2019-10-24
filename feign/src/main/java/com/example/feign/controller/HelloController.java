package com.example.feign.controller;

import com.example.feign.service.FeignInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final FeignInterface feignInterface;

    public HelloController(FeignInterface feignInterface) {
        this.feignInterface = feignInterface;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignInterface.sayHelloFromClient(name);
    }
}
