package com.downing.mq.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author downing
 * @descript
 */
@Component
@RabbitListener(queues = "fanout2")
public class FanoutCustomer2 {

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("fanout2接受到的消息:" + message);
    }
}
