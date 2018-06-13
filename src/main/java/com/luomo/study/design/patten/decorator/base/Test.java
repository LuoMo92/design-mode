package com.luomo.study.design.patten.decorator.base;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Test {

    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        /**
         * 装饰的方式是：
         * 首先用ConcreteComponent实例化对象c
         * 然后用ConcreteDecoratorA的实例化对象d1来包装c
         * 再用ConcreteDecoratorB的对象d2包装d1
         * 最终执行d2的operation()
         */
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }

}
