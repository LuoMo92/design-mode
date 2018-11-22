package com.luomo.study.design.patten.singleton;

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

    /**
     * 主要是因为一个类的静态属性只会在第一次加载类时初始化，这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
     * 所以在初始化进行一半的时候，别的线程是无法使用的，因为JVM会帮我们强行同步这个过程。
     * 另外由于静态变量只初始化一次，所以singleton仍然是单例的。
     */
    private static class Singleton {
        protected static Singleton singleton = new Singleton();
    }

}
