package com.cpucode.rabbitmq.work;

import com.cpucode.rabbitmq.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * work模式；消费者接收消息
 *
 * @author : cpucode
 * @date : 2021/3/20
 * @time : 11:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Consumer1 {
    public static void main(String[] args) throws Exception {
        //1. 创建连接工厂；
        //2. 创建连接；（抽取一个获取连接的工具类）
        Connection connection = ConnectionUtil.getConnection();

        //3. 创建频道；
        final Channel channel = connection.createChannel();

        /**
         * 4. 声明队列；
         *
         * 参数1：队列名称
         * 参数2：是否定义持久化队列（消息会持久化保存在服务器上）
         * 参数3：是否独占本连接
         * 参数4：是否在不使用的时候队列自动删除
         * 参数5：其它参数
         */
        channel.queueDeclare(Producer.QUEUE_NAME, true, false, false, null);

        //每次可以预取多少个消息
        channel.basicQos(1);

        //5. 创建消费者（接收消息并处理消息）；
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                try{
                    //路由key
                    System.out.println("路由key为：" + envelope.getRoutingKey());
                    //交换机
                    System.out.println("交换机为：" + envelope.getExchange());
                    //消息id
                    System.out.println("消息id为：" + envelope.getDeliveryTag());
                    //接收到的消息
                    System.out.println("消费者1---接收到的消息为：" + new String(body, "utf-8"));

                    Thread.sleep(1000);

                    /**
                     * 确认消息
                     *
                     * 参数1：消息id
                     * 参数2：false表示只有当前这条被处理
                     */
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        /**
         * 6. 监听队列
         *
         * 参数1：队列名
         * 参数2：是否要自动确认；设置为true表示消息接收到自动向MQ回复接收到了，MQ则会将消息从队列中删除；
         * 如果设置为false则需要手动确认
         * 参数3：消费者
         */
        channel.basicConsume(Producer.QUEUE_NAME, true, defaultConsumer);
    }
}
