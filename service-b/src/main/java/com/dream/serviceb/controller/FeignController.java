package com.dream.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private ServiceAFeign mSerViceAFeign;

    @RequestMapping("/feignTest")
    public String feignTest() {
        String resultFromServiceA = mSerViceAFeign.hello();
        return "result from service A:" + resultFromServiceA;
    }
}
