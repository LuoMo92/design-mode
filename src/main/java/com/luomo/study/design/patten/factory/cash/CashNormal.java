package com.luomo.study.design.patten.factory.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class CashNormal extends CashSuper {

    /**
     * 原价返回
     * @param money 原价
     * @return
     */
    @Override
    public double acceptMoney(double money) {
        return money;
    }
}
