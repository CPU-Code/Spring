package com.cpucode.weblogout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cpucode
 * @date : 2021/7/3
 * @time : 21:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello security";
    }

    @GetMapping("index")
    public String index() {
        return "hello index";
    }
}
