package com.luomo.study.design.patten.builder;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class Test {

    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        director.construct(b1);
        Product result = b1.getResult();
        result.show();
        director.construct(b2);
        Product result1 = b2.getResult();
        result1.show();
    }

}
