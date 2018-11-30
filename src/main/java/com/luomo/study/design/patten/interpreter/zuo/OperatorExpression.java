package com.luomo.study.design.patten.interpreter.zuo;

/**
 * 终结符表达式，对应-、+
 * @author LiuMei
 * @date 2018-11-30.
 */
public class OperatorExpression implements Expression{

    @Override
    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }

}
