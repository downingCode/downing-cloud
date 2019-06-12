package com.downing.mq.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author downing
 * @descript
 */
@Component
@RabbitListener(queues = "fanout1")
public class FanoutCustomer1 {

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("fanout1接受到的消息:" + message);
    }
}
