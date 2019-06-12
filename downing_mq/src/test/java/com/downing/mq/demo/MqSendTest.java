package com.downing.mq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MqSendTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 任何发送到Direct Exchange的消息都会被转发到RouteKey中指定的Queue
     */
    @Test
    public void directTest() {
        rabbitTemplate.convertAndSend("directTest", "direct模式发送消息");
    }

    /**
     * 任何发送到Fanout Exchange的消息都会被转发到与该Exchange绑定(Binding)的所有
     * Queue上。
     */
    @Test
    public void fanoutTest() {
        rabbitTemplate.convertAndSend("fanoutExange", "", "fabout模式发送消息");
    }

    /**
     * 在进行绑定时，要提供一个该队列关心的主题，如“#.downing.#”表示该队列关心所有涉及
     * downing的消息(一个RouteKey为”MQ.log.error”的消息会被转发到该队列)。
     * “#”表示0个或若干个关键字，“*”表示一个关键字。如“downing.”能与“downing.aaa”匹配，无法
     * 与“downing.aaa.bbb”匹配；但是“downing.#”能与上述两者匹配。
     */
    @Test
    public void TopicTest1() {
        rabbitTemplate.convertAndSend("topicTest", "downing.lin", "topic模式发送消息");
    }
}