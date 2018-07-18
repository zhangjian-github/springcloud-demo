package com.example.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangJian
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/provider")
    public String home(@RequestParam(value = "name", defaultValue = "defaultName") String name) {
        return "provider " + name + " ,i am from port:" + port;
    }

}
