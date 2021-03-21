package com.cpucode.consumer.controller;

import com.cpucode.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 19:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User queryById(Long id){
        String url = "http://localhost:9091/user/8";
        return restTemplate.getForObject(url, User.class);
    }
}
