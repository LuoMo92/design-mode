package com.luomo.study.design.patten.interpreter.zuo;

/**
 * 算数表达式（非终结符表达式，对应arithmetic）
 * @author LiuMei
 * @date 2018-11-30.
 */
public class ArithmeticExpression implements Expression {

    @Override
    public void interpreter(Context context) {
        //计算结果
        context.setResult(getResult(context));
        //清空操作数
        context.getOperateNumbers().clear();
        //将结果压入左操作数
        context.setLeftOperateNumber(context.getResult());
    }

    private int getResult(Context context){
        int result = 0;
        switch (context.getOperator()) {
            case '+':
                result = context.getOperateNumbers().get(0) + context.getOperateNumbers().get(1);
                break;
            case '-':
                result = context.getOperateNumbers().get(0) - context.getOperateNumbers().get(1);
                break;
            default:
                break;
        }
        return result;
    }

}
