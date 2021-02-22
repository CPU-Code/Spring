package com.cpucode.controller;

import com.cpucode.domain.User;
import com.cpucode.domain.Vo;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 12:45
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/getController")
public class GetController {

    /**
     * 获得基本类型参数
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/getController/save?name=cpucode&age=11
     * */
    @RequestMapping("/save")
    @ResponseBody
    public void save(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    /**
     * 获得POJO类型参数
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/getController/save1?username=cpucode&age=11
     * */
    @RequestMapping("/save1")
    @ResponseBody
    public void save1(User user){
        System.out.println(user);
    }

    /**
     * 获得数组类型参数
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/getController/save2?strs=aa&strs=bb
     * */
    @RequestMapping("/save2")
    @ResponseBody
    public void save2(String[] strs){
        System.out.println(Arrays.asList(strs));
    }

    /**
     * 获得集合类型参数
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/jsp/form.jsp
     * */
    @RequestMapping("/save3")
    @ResponseBody
    public void save3(Vo vo){
        System.out.println(vo);
    }

    /**
     * 获得集合类型参数
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/jsp/ajax.jsp
     * */
    @RequestMapping("/save4")
    @ResponseBody
    public void save4(@RequestBody List<User> userList){
        System.out.println(userList);
    }

    /**
     * 参数绑定注解@RequestParam
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/jsp/form.jsp
     * */
    @RequestMapping("/save5")
    @ResponseBody
    public void save5(@RequestParam(value = "name", required = false, defaultValue = "cpu") String username){
        System.out.println(username);
    }

    /**
     * Restful风格的参数的获取
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/getController/save6/cpucode
     * */
    @RequestMapping(value = "/save6/{name}")
    @ResponseBody
    public void save6(@PathVariable(value = "name") String username){
        System.out.println(username);
    }

    /**
     * 自定义类型转换器
     *
     * http://localhost:8080/cpucode_spring_mvc_war_exploded/getController/save7?date=2020-5-10
     * */
    @RequestMapping("/save7")
    @ResponseBody
    public void save7(Date date){
        System.out.println(date);
    }

    /**
     * 获得Servlet相关API
     * */
    @RequestMapping("/save8")
    @ResponseBody
    public void save8(HttpServletRequest request, HttpServletResponse respone, HttpSession session){
        System.out.println(request);
        System.out.println(respone);
        System.out.println(session);
    }


    /**
     * 获得请求头信息
     * */
    @RequestMapping("/save9")
    @ResponseBody
    public void save9(@RequestHeader(value = "User-Agent" , required = false) String user_agent){
        System.out.println(user_agent);
    }

    /**
     * @CookieValue : 可以获得指定Cookie的值
     * */
    @RequestMapping("/save10")
    @ResponseBody
    public void save10(@CookieValue(value = "JSESSIONID") String jsessionID){
        System.out.println(jsessionID);
    }
}
