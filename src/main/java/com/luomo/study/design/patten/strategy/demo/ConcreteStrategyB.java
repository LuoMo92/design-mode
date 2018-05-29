package com.luomo.study.design.patten.strategy.demo;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class ConcreteStrategyB extends Strategy {
    @Override
    public void algorithmInterface() {
        print("算法B的实现");
    }
}
