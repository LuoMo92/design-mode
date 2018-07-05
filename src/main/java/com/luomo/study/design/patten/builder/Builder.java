package com.luomo.study.design.patten.builder;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();

}
