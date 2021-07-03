package com.cpucode.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cpucode
 * @date : 2021/7/2
 * @time : 17:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RestController
@RequestMapping("/text")
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "hello security";
    }
}
