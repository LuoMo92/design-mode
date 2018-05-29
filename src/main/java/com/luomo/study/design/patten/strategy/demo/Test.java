package com.luomo.study.design.patten.strategy.demo;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class Test {

    public static void main(String[] args) {
        Context context;
        //实例化不同的策略
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }

}
