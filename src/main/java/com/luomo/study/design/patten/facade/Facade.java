package com.luomo.study.design.patten.facade;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-04.
 */
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        print("方法组A");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        print("方法组B");
        two.methodTwo();
        three.methodThree();
    }

}
