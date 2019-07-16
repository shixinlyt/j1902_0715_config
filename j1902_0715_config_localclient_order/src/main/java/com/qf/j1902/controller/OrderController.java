package com.qf.j1902.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Value("${myname}")
    private String name;
    @Value("${server.port}")
    private String port;
    @RequestMapping
    public String showValue(){
        return name+":::"+port;
    }
}
