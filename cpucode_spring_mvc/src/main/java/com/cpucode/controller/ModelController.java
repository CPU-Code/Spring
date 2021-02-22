package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 10:31
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/modelController")
public class ModelController {
    @RequestMapping("/save")
    public ModelAndView save(){
        /**
         * Model:模型 作用封装数据
         * View：视图 作用展示数据
         * */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "cpuCode");

        //设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping("/save2")
    public ModelAndView save2(ModelAndView modelAndView){
        modelAndView.addObject("username", "哈啊哈哈");
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping("/save3")
    public String save3(Model model){
        model.addAttribute("username", "呵呵, 你可真美");

        return "success";
    }
}
