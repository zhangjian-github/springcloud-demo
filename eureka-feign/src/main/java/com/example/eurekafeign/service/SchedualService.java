package com.example.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign是基于接口的
 * @FeignClient 提供端的名称
 */
@FeignClient(value = "service-provider")
public interface SchedualService {

    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    String getByFeign(@RequestParam(value = "name") String name);
}
