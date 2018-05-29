package com.luomo.study.design.patten.strategy.demo;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class Context {

    private Strategy strategy;

    /**
     * 构造函数
     * @param strategy 具体的策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }

}
