package com.luomo.study.design.patten.decorator.sample;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class BigTrouser extends Finery {

    @Override
    public void show(){
        print("垮裤");
        super.show();
    }

}
