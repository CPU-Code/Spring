package com.cpucode.rabbitmq;

import com.cpucode.rabbitmq.config.RabbitMqConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 11:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test1(){
        rabbitTemplate.convertAndSend(RabbitMqConfig.CPU_TOPIC_EXCHANGE,
                "cpu.insert", "商品新增,路由Key为 cpu.insert");

        rabbitTemplate.convertAndSend(RabbitMqConfig.CPU_TOPIC_EXCHANGE,
                "cpu.update", "商品新增,路由Key为 cpu.update");

        rabbitTemplate.convertAndSend(RabbitMqConfig.CPU_TOPIC_EXCHANGE,
                "cpu.delete", "商品新增,路由Key为 cpu.delete");

        rabbitTemplate.convertAndSend(RabbitMqConfig.CPU_TOPIC_EXCHANGE,
                "a.cpu.delete", "商品新增,路由Key为a.cpu.delete");
    }
}
