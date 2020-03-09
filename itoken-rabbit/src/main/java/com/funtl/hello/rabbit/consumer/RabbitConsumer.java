package com.funtl.hello.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 这个是项目启动就监听的
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class RabbitConsumer {

    @RabbitHandler
    public void process(String content){
        System.out.println("consumer:" + content);
    }
}
