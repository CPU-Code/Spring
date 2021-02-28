package com.cpucode.controller;

import com.cpucode.exception.MyException;
import com.cpucode.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 21:56
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/show")
    public String show(){
        System.out.println("抛出类型转换异常");

        demoService.show1();

        return "index";
    }

    @RequestMapping("/show2")
    public String show2(){
        System.out.println("抛出除零异常");

        demoService.show2();

        return "index";
    }

    @RequestMapping("/show3")
    public String show3() throws FileNotFoundException {
        System.out.println("文件找不到异常");

        demoService.show3();

        return "index";
    }

    @RequestMapping("/show4")
    public String show4(){
        System.out.println("空指针异常");

        demoService.show4();

        return "index";
    }

    @RequestMapping("/show5")
    public String show5() throws MyException {
        System.out.println("自定义异常");

        demoService.show5();

        return "index";
    }

}
