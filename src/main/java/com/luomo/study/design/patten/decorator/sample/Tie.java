package com.luomo.study.design.patten.decorator.sample;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Tie extends Finery {

    @Override
    public void show(){
        print("领带");
        super.show();
    }

}
