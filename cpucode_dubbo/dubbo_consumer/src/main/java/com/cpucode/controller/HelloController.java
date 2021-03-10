package com.cpucode.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cpucode.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : cpucode
 * @date : 2021/3/10
 * @time : 18:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){

        return helloService.sayHello(name);
    }
}
