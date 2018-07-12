package com.luomo.study.design.patten.adapter;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Adapter extends Target {

    /**
     * 建立一个私有的Adaptee对象
     */
    private Adaptee adaptee = new Adaptee();

    /**
     * 表面上调用request()方法变成实际调用specialRequest()
     */
    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
