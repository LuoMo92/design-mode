package com.luomo.study.design.patten.factory.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class Test {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("正常收费");
        cashSuper.acceptMoney(100);
    }

}
