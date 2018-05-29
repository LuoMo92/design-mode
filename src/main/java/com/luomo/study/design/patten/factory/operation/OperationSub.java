package com.luomo.study.design.patten.factory.operation;

/**
 * 减法类
 *
 * @author LiuMei
 * @date 2018-05-18.
 */
public class
OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }

}
