package com.luomo.study.design.patten.factory.operation;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-18.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(10);
        operation.setNumberB(10);
        print(operation.getResult());
    }
}
