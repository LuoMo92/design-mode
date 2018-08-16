package com.luomo.study.design.patten.flyweight;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        print("具体Flyweight：" + extrinsicstate);
    }
}
