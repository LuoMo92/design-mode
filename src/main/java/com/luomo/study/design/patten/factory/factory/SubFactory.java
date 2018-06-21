package com.luomo.study.design.patten.factory.factory;

import com.luomo.study.design.patten.factory.operation.Operation;
import com.luomo.study.design.patten.factory.operation.OperationSub;

/**
 * @author LiuMei
 * @date 2018-06-21.
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
