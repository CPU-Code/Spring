package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 8:42
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    /**
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/userController/save
     * */
    @RequestMapping(value = "/save")
    public String save(){
        System.out.println("UserController 中 save 跑起来");

        return "success";
    }
}
