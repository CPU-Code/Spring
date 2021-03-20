package com.cpucode.rabbitmq.topic;

import com.cpucode.rabbitmq.util.ConnectionUtil;
import com.rabbitmq.client.*;

/**
 * 通配符模式：发送消息
 *
 * @author : cpucode
 * @date : 2021/3/20
 * @time : 15:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Producer {
    /**
     * 交换机名称
     */

    static final String TOPIC_EXCHAGE = "topic_exchage";
    /**
     * 队列名称
     */
    static final String TOPIC_QUEUE_1 = "topic_queue_1";

    /**
     *  队列名称
     */
    static final String TOPIC_QUEUE_2 = "topic_queue_2";

    public static void main(String[] args) throws Exception {
        //1. 创建连接；
        Connection connection = ConnectionUtil.getConnection();

        //2. 创建频道；
        Channel channel = connection.createChannel();

        /**
         * 3. 声明交换机；
         * 参数1：交换机名称
         * 参数2：交换机类型（fanout,direct,topic）
         */
        channel.exchangeDeclare(TOPIC_EXCHAGE, BuiltinExchangeType.TOPIC);

        //6. 发送消息；
        String message = "商品新增。通配符模式 ；routing key 为 cpucode.insert ";

        /**
         * 参数1：交换机名称；如果没有则指定空字符串（表示使用默认的交换机）
         * 参数2：路由key，简单模式中可以使用队列名称
         * 参数3：消息其它属性
         * 参数4：消息内容
         */
        channel.basicPublish(TOPIC_EXCHAGE, "cpucode.insert", null, message.getBytes());
        System.out.println("已发送消息：" + message);

        /**
         * 参数1：交换机名称；如果没有则指定空字符串（表示使用默认的交换机）
         * 参数2：路由key，简单模式中可以使用队列名称
         * 参数3：消息其它属性
         * 参数4：消息内容
         */
        channel.basicPublish(TOPIC_EXCHAGE, "cpucode.update", null, message.getBytes());
        System.out.println("已发送消息：" + message);

        message = "商品删除。通配符模式 ；routing key 为 cpucode.delete ";

        /**
         * 参数1：交换机名称；如果没有则指定空字符串（表示使用默认的交换机）
         * 参数2：路由key，简单模式中可以使用队列名称
         * 参数3：消息其它属性
         * 参数4：消息内容
         */
        channel.basicPublish(TOPIC_EXCHAGE, "cpucode.delete", null, message.getBytes());
        System.out.println("已发送消息：" + message);

        //6. 关闭资源
        channel.close();
        connection.close();
    }
}
