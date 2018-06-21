package com.luomo.study.design.patten.factory.factory;

import com.luomo.study.design.patten.factory.operation.Operation;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-21.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        print(operation.getResult());
    }

}
