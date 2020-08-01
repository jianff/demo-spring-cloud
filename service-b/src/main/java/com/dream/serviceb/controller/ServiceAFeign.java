package com.dream.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-DREAM-A")
public interface ServiceAFeign {

    @RequestMapping("/hello")
    public String hello();
}
