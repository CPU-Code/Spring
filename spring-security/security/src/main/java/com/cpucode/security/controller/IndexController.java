package com.cpucode.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : cpucode
 * @date : 2021/7/2
 * @time : 17:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
public class IndexController {

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "success";
    }
}
