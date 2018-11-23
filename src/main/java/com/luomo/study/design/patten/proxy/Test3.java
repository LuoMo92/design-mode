package com.luomo.study.design.patten.proxy;

import java.lang.reflect.Proxy;

/**
 * @author LiuMei
 * @date 2018-11-23.
 */
public class Test3 {

    public static void main(String[] args){
        TestInterface o = (TestInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{TestInterface.class}, new DynamicProxy(new TestClass()));
        o.method1();
    }

}
