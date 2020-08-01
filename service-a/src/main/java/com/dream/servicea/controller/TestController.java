package com.dream.servicea.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
        return "hello,this is service A, port:" + port;
    }

    String fallback() {
        return "服务繁忙";
    }
}
