package com.cpucode.proxy.jdk;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 9:43
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Target implements TargetInterface{
    public void save() {
        System.out.println("Target 中 save 跑起来了");
    }
}
