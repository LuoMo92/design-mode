package com.luomo.study.design.patten.factory.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1;

    /**
     * 初始化时，必须输入折扣率
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptMoney(double money) {
        return money * moneyRebate;
    }
}
