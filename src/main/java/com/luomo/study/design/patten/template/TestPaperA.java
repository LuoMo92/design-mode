package com.luomo.study.design.patten.template;

/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public class TestPaperA extends TestPaper {

    /**
     * 重写父类的方法
     * @return
     */
    @Override
    protected String answer1() {
        return "A";
    }

    @Override
    protected String answer2() {
        return "B";
    }
}
