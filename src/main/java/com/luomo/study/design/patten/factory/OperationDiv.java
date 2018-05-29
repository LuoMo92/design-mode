package com.luomo.study.design.patten.factory;

/**
 * 除法类
 *
 * @author LiuMei
 * @date 2018-05-18.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        double numberB = getNumberB();
        if (numberB == 0) {
            throw new Exception("除数不能为0");
        }
        double result = getNumberA() / numberB;
        return result;
    }

}
