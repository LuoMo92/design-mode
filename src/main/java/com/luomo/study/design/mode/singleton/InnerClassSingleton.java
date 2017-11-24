package com.luomo.study.design.mode.singleton;

/**
 *
 * 以解决JVM调优更改指令执行顺序可能引发的问题
 *
 * 可能写法不太符合习惯,见FinalSingleton.java
 *
 * @author LiuMei
 * @date 2017-11-24.
 */
public class InnerClassSingleton {

    public static Singleton getInstance() {
        return Singleton.singleton;
    }

    private static class Singleton {
        protected static Singleton singleton = new Singleton();
    }

}
