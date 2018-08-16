package com.luomo.study.design.patten.mediator;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public abstract class Colleague {

    protected Mediator mediator;

    /**
     * 构造方法，得到中介者对象
     * @param mediator
     */
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

}
