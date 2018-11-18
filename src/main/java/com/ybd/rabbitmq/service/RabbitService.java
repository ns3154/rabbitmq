package com.ybd.rabbitmq.service;

import com.ybd.rabbitmq.model.UserBO;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2018/11/18 20:13
 **/
public interface RabbitService
{
    String object();

    void get(UserBO uo);
}
