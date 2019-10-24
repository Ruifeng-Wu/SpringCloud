package com.example.eureka.client.copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopyApplication.class, args);
    }

}
