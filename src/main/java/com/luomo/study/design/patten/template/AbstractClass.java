package com.luomo.study.design.patten.template;

/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public abstract class AbstractClass {

    /**
     * 一些抽象行为，放到子类去实现
     */
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    /**
     * 模板方法，给出了逻辑的骨架
     * 而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现
     */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
