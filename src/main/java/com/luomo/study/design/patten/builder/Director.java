package com.luomo.study.design.patten.builder;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}
