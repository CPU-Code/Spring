package com.cpucode.rabbitmq.listener;

import org.springframework.stereotype.Component;

/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 11:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
public class MyListener {
    /**
     * 接收队列消息
     *
     * @param message   接收到的消息
     */
    public void MyListener1(String message){
        System.out.println("消费者接收到消息：" + message);
    }
}
