package com.cpucode.csrfsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author : cpucode
 * @date : 2021/7/5
 * @time : 19:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
public class CSRFController {
    @GetMapping("/toupdate")
    public String test(Model model){
        return "csrf/csrf_delate";
    }

    @PostMapping("/update_token")
    public String getToken() {
        return "csrf/csrf_token";
    }
}
