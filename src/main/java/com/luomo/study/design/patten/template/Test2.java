package com.luomo.study.design.patten.template;

/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public class Test2 {

    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();
        c.templateMethod();
    }

}
