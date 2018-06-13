package com.luomo.study.design.patten.decorator.base;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * 本类的独有功能，以区别于ConcreteDecoratorB
     */
    private String addedState;

    /**
     * 运行原Component的operation()
     * 再执行本类功能，相当于对原Component进行了装饰
     */
    @Override
    public void operation(){
        super.operation();
        addedState = "New State";
        print("具体装饰对象A的操作");
    }

}
