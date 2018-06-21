package com.luomo.study.design.patten.factory.factory;

import com.luomo.study.design.patten.factory.operation.Operation;

/**
 * @author LiuMei
 * @date 2018-06-21.
 */
public interface IFactory {

    Operation createOperation();

}
