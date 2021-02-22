package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 20:14
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/targetController")
public class TargetController {

    @RequestMapping("/show")
    public ModelAndView show(){
        System.out.println("目标资源执行 ....");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "cpucode");
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
