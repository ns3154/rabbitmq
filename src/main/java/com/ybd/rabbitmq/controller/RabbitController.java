package com.ybd.rabbitmq.controller;

import com.ybd.rabbitmq.Producer;
import com.ybd.rabbitmq.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2018/11/18 19:52
 **/
@RestController
public class RabbitController
{

    @Autowired
    private Producer producer;

    @Autowired
    private RabbitService rabbitService;

    @PostMapping("/hello")
    public void hello()
    {
        producer.send();
    }

    @PostMapping("object")
    public String object()
    {
        return rabbitService.object();
    }

}
