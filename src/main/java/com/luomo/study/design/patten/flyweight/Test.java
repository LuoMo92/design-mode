package com.luomo.study.design.patten.flyweight;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 代码外部状态
         */
        int extrinsicstate = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightX = flyweightFactory.getFlyweight("X");
        flyweightX.operation(--extrinsicstate);
        Flyweight flyweightY = flyweightFactory.getFlyweight("Y");
        flyweightY.operation(--extrinsicstate);
        Flyweight flyweightZ = flyweightFactory.getFlyweight("Z");
        flyweightZ.operation(--extrinsicstate);

        UnSharedConcreteFlyweight unSharedConcreteFlyweight = new UnSharedConcreteFlyweight();
        unSharedConcreteFlyweight.operation(--extrinsicstate);
    }
}
