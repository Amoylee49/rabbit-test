package com.xuecheng.test.rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * rabbitmq 入门教程
 */
public class Consumer01 {
    //队列名称
    public static final String QUEUE = "helloWorld";


    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = null;

        ConnectionFactory connectionFactory = new ConnectionFactory();

    }
}
