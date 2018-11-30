package com.luomo.study.design.patten.interpreter.zuo;

/**
 * 非终结符表达式，对应number
 * @author LiuMei
 * @date 2018-11-30.
 */
public class NumberExpression implements Expression{

    @Override
    public void interpreter(Context context) {
        //设置操作数
        Integer operateNumber = Integer.valueOf(String.valueOf(context.current()));
        if (context.getOperateNumbers().size() == 0) {
            context.setLeftOperateNumber(operateNumber);
            context.setResult(operateNumber);
        }else {
            context.setRightOperateNumber(operateNumber);
            //转换成算数表达式
            Expression expression = new ArithmeticExpression();
            expression.interpreter(context);
        }
    }

}
