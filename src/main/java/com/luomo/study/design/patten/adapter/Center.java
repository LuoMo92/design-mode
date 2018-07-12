package com.luomo.study.design.patten.adapter;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        print("中锋"+this.getName()+"进攻");
    }

    @Override
    public void defense() {
        print("中锋"+this.getName()+"防守");
    }
}
