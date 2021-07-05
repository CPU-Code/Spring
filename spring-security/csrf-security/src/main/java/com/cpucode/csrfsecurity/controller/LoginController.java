package com.cpucode.csrfsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : cpucode
 * @date : 2021/7/5
 * @time : 19:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
public class LoginController {
    @GetMapping("/userLogin")
    public String login(){
        return "login/login.html";
    }
}
