package com.ybd.rabbitmq;

import com.ybd.rabbitmq.model.UserBO;
import com.ybd.rabbitmq.service.RabbitService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     消费者
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2018/11/18 19:51
 **/
@Component
public class Consumer
{

    @Autowired
    private RabbitService rabbitService;

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

    @RabbitHandler
    @RabbitListener(queues = "object")
    public void object(UserBO uo)
    {
        rabbitService.get(uo);
    }
}
