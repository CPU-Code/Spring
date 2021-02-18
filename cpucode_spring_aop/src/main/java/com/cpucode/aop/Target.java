package com.cpucode.aop;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 10:50
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Target implements TargetInterface {

    public void save(){
        System.out.println("save running ...");


    }

    public void exce(){
        System.out.println("产生错误");
        int i = 1/0;
    }
}
