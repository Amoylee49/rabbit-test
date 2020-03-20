package com.xuecheng.test.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer01 {
    //队列名称
    public static final String Queue = "helloWorld";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = null;
        Channel channel = null;
        //git branch --set-upstream-to=origin/master
        //git remote add origin git@github.com:Amoylee49/rabbitmq-test.git
                //Amoylee49/rabbitmq-test.git
        git config --global user.email "Amoyleeo@qq.com"
        git config --global user.name "Amoylee49"



        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            factory.setPort(5672);
            factory.setUsername("guest");
            factory.setPassword("guest");
            factory.setVirtualHost("/");//rabbitmq默认虚拟机位“/”

            //创建与RabbitMQ服务的tcp连接
            connection = factory.newConnection();
            //创建与Exchange的通道，每个连接可以创建多个通道，每个通道代表一个会话任务
            channel = connection.createChannel();
            /**
             * 声明队列，如果Rabbit中没有此队列将自动创建
             * String queue,
             * String exchange,
             * String routingKey
             */
            channel.queueDeclare();











        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }
}
