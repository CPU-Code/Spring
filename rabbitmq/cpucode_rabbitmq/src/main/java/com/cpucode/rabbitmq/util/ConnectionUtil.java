package com.cpucode.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author : cpucode
 * @date : 2021/3/20
 * @time : 10:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConnectionUtil {
    public static Connection getConnection() throws Exception {
        //1. 创建连接工厂（设置RabbitMQ的连接参数）；
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //主机；默认localhost
        connectionFactory.setHost("localhost");
        //连接端口；默认5672
        connectionFactory.setPort(5672);
        //虚拟主机；默认/
        connectionFactory.setVirtualHost("/cpu");
        //用户名；默认guest
        connectionFactory.setUsername("cpucode");
        //密码；默认guest
        connectionFactory.setPassword("cpucode");

        //2. 创建连接；
        return connectionFactory.newConnection();
    }
}
