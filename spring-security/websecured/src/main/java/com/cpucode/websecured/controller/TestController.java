package com.cpucode.websecured.controller;

import org.springframework.security.access.annotation.Secured;
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

    /**
     * 判断是否具有角色，另外需要注意的是这里匹配的字符串需要添加前缀“ROLE_“
     * @return
     */
    @GetMapping("update")
    @Secured({"ROLE_sale","ROLE_manager"})
    public String update() {
        System.out.println("update......");
        return "hello update";
    }
}
