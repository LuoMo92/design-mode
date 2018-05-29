package com.luomo.study.design.patten.factory.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0;
    private double moneyReturn = 0;

    /**
     * 构造函数
     * @param moneyCondition 返利条件
     * @param moneyReturn 返利额
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptMoney(double money) {
        //如果大于返利条件，减去返利额
        if (money >= moneyCondition) {
            money = money - (Math.floor(money / moneyCondition)) * moneyReturn;
        }
        return money;
    }
}
