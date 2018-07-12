package com.luomo.study.design.patten.adapter;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Forward extends Player {

    public Forward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        print("前锋"+this.getName()+"进攻");
    }

    @Override
    public void defense() {
        print("前锋"+this.getName()+"防守");
    }
}
