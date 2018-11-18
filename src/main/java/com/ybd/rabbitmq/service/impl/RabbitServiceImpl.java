package com.ybd.rabbitmq.service.impl;

import com.alibaba.fastjson.JSON;
import com.ybd.rabbitmq.model.UserBO;
import com.ybd.rabbitmq.service.RabbitService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2018/11/18 20:13
 **/
@Service
public class RabbitServiceImpl implements RabbitService
{

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void get(UserBO uo)
    {
        System.out.println(JSON.toJSON(uo));
    }

    @Override
    public String object()
    {
        UserBO uo = new UserBO();
        uo.setId(System.currentTimeMillis());
        uo.setNickName("张三");
        uo.setAge(2);
        uo.setBirthDay(new Date());
        uo.setMoney(0.99);

        rabbitTemplate.convertAndSend("object", uo);
        return "ok";
    }
}
