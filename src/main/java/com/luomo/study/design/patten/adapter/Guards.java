package com.luomo.study.design.patten.adapter;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        print("后卫"+this.getName()+"进攻");
    }

    @Override
    public void defense() {
        print("后卫"+this.getName()+"防守");
    }
}
