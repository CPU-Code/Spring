package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping("/save1")
    public void save1(HttpServletResponse response) throws IOException {
        response.getWriter().println("dd");
    }

}
