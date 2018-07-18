package com.example.eurekaribbon.controller;

import com.example.eurekaribbon.service.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/ribbon")
    public String hi(@RequestParam String name) {
        return helloService.consume(name);
    }
}
