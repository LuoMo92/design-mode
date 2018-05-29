package com.luomo.study.design.patten.strategy.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class Test {

    public static void main(String[] args) {
       CashContext cashContext = new CashContext("满300减100");
       cashContext.getResult(500);
    }

}
