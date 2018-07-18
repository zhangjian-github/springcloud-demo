package com.example.eurekaribbon.service.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String consume(String name) {
        return restTemplate.getForObject("http://service-provider/provider?name="+name,String.class);
    }
}
