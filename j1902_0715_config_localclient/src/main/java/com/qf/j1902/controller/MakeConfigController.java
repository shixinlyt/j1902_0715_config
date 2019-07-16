package com.qf.j1902.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeConfigController {
    @Value("${myname}")
    private String name;
    @Value("${server.port}")
    private String port;
    @RequestMapping("/myname")
    public String showName(){
        return "myname++***********=====::"+name+"port**::"+port;
    }
}
