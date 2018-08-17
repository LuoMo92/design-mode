package com.luomo.study.design.patten.interpreter;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-17.
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        print("终端解释器");
    }
}
