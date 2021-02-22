package com.cpucode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 11:16
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Controller
@RequestMapping("/responseController")
public class ResponseController {


    @RequestMapping("/save")
    /**
     * 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
     * */
    @ResponseBody
    public String save(){
        return "嘿哥们 开dd呀";
    }

    @RequestMapping("/save2")
    @ResponseBody
    public String save2(){
        return "{\"username\": \"cpuCode\", \"age\" : 22}";
    }

/*    @RequestMapping("/save3")
    @ResponseBody
    public String save3() throws JsonProcessingException {
        User user = new User();
        user.setUsername("hahei");
        user.setAge(21);

        //使用json的转换工具将对象转换成json格式字符串在返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

        return json;
    }*/
}
