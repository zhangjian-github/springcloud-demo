package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private SchedualService schedualService;

    @GetMapping(value = "/feign")
    public String sayHi(@RequestParam String name) {
        return schedualService.getByFeign(name);
    }

}
