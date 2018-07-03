package com.luomo.study.design.patten.template;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public abstract class TestPaper {

    public void question1() {
        print("试题1");
        print("答案:" + answer1());
    }

    /**
     * 答案的方法目的是给继承的子类重写
     * 因为这里每个人的答案都是不同的
     * @return
     */
    protected abstract String answer1();

    public void question2() {
        print("试题2");
        print("答案:" + answer2());
    }

    protected abstract String answer2();
}
