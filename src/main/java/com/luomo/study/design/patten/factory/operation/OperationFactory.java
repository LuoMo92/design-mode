package com.luomo.study.design.patten.factory.operation;

/**
 * 简单工厂类
 *
 * @author LiuMei
 * @date 2018-05-18.
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}
