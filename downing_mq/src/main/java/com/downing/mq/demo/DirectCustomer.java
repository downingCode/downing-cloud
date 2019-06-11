package com.downing.mq.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author downing
 * @descript 消息监听处理器
 * 指定监听名为directTest的queues
 */
@RabbitListener(queues = "directTest")
@Component
public class DirectCustomer {

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("收到directTest的消息：" + message);
    }
}
