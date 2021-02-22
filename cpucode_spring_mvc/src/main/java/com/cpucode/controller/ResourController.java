package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 8:58
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/resourController")
public class ResourController {
    /**
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/resourController/save?username=cpuCode
     * */
    @RequestMapping(value = "/save", method = RequestMethod.GET, params = {"username"})
    public String save(){
        System.out.println("resourController 中 save 飞起来");

        return "success";
    }
}
