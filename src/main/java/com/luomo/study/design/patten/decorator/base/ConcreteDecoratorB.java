package com.luomo.study.design.patten.decorator.base;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * 本类独有方法，以区别于ConcreteDecoratorA
     */
    private void addedBehavior() {

    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        print("具体装饰对象B的操作");
    }

}
