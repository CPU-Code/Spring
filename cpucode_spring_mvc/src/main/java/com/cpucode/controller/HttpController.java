package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 10:47
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/httpController")
public class HttpController {

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        request.setAttribute("username,", "你看着哥哥不怕倒");

        return "success";
    }
}
