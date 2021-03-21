package com.cpucode.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 10:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Configuration
public class RabbitMqConfig {
    /**
     * 交换机名称
     */
    public static final String CPU_TOPIC_EXCHANGE = "cpu_topic_exchange";
    /**
     * 队列名称
     */
    public static final String CPU_QUEUE = "cpu_queue";

    /**
     * 声明交换机
     */
    @Bean("cpuTopicExchange")
    public Exchange topicExchange(){
        return ExchangeBuilder.topicExchange(CPU_TOPIC_EXCHANGE).durable(true).build();
    }

    /**
     * 声明队列
     */
    @Bean("cpuQueue")
    public Queue cpuQueue(){
        return QueueBuilder.durable(CPU_QUEUE).build();
    }

    /**
     * 将队列绑定到交换机
     */
    @Bean
    public Binding cpuQueueExchange(@Qualifier("cpuQueue") Queue queue,
                                    @Qualifier("cpuTopicExchange")Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("cpu.#").noargs();
    }


}
