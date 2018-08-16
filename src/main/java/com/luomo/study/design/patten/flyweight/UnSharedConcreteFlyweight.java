package com.luomo.study.design.patten.flyweight;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class UnSharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        print("不共享的具体Flyweight："+extrinsicstate);
    }
}
