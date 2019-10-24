package com.example.feign.service;

import com.example.feign.service.impl.FeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-eureka-client", fallback = FeignService.class)
public interface FeignInterface {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClient(@RequestParam(value = "name") String name);
}
