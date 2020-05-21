package com.yuan;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Provider8001Appplication {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Appplication.class,args);
    }
}
