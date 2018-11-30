package com.luomo.study.design.patten.interpreter.zuo;

/**
 * 终结符表达式，对应0、1、2、3、4、5、6、7、8、9
 * @author LiuMei
 * @date 2018-11-30.
 */
public class DigitExpression implements Expression{

    @Override
    public void interpreter(Context context) {
        //如果是数字，则直接转为number表达式
        Expression expression = new NumberExpression();
        expression.interpreter(context);
    }

}
