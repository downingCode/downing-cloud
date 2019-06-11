package com.downing.mq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DirectCustomerTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void receiveMessage() {
        rabbitTemplate.convertAndSend("directTest", "direct");
    }
}