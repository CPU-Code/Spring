package com.cpucode.service.impl;

import com.cpucode.service.HelloService;

/**
 * @author : cpucode
 * @date : 2021/3/10
 * @time : 17:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name){
        return "8083 cpucode" + name;
    }
}
