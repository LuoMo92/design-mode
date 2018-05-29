package com.luomo.study.design.patten.factory;

/**
 * 乘法类
 *
 * @author LiuMei
 * @date 2018-05-18.
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() * getNumberB();
        return result;
    }

}
