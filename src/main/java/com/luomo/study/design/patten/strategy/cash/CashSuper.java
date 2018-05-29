package com.luomo.study.design.patten.strategy.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public abstract class CashSuper {

    /**
     * 收取现金
     * @param money 原价
     * @return 实际收取的价格
     */
    public abstract double acceptMoney(double money);
}
