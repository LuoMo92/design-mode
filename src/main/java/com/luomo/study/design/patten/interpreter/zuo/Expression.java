package com.luomo.study.design.patten.interpreter.zuo;

/**
 * 抽象表达式，定义一个解释操作
 * @author LiuMei
 * @date 2018-11-30.
 */
public interface Expression {

    void interpreter(Context context);

}