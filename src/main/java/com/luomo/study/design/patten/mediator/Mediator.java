package com.luomo.study.design.patten.mediator;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public abstract class Mediator {

    /**
     * 定义一个抽象的发送消息方法
     * 得到同事对象和发送消息
     * @param message
     * @param colleague
     */
    public abstract void send(String message,Colleague colleague);

}
