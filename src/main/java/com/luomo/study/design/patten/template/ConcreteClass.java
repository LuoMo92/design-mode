package com.luomo.study.design.patten.template;


import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        print("具体类1方法1的具体实现");
    }

    @Override
    public void primitiveOperation2() {
        print("具体类1方法2的具体实现");
    }
}
