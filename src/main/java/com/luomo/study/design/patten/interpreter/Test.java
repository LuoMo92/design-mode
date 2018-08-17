package com.luomo.study.design.patten.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuMei
 * @date 2018-08-17.
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }

}
