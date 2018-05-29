package com.luomo.study.design.patten.factory.operation;

/**
 * 操作类
 *
 * @author LiuMei
 * @date 2018-05-18.
 */
public class Operation {

    private double numberA;

    private double numberB;

    public double getResult() throws Exception {
        double result = 0;
        return result;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
