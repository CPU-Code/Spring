package com.cpucode.proxy.jdk;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 9:45
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Advice {
    public void bufore(){
        System.out.println("前置增强");
    }

    public void afterReturning(){
        System.out.println("后置增强");
    }
}
