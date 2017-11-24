package com.luomo.study.design.mode.singleton;

/**
 * 单例模式最终版
 *
 * @author LiuMei
 * @date 2017-11-24.
 */
public class FinalSingleton {

    private FinalSingleton() {
    }

    public static FinalSingleton getInstance() {
        return FinalSingletonInner.finalSingleton;
    }

    private static class FinalSingletonInner {

        static FinalSingleton finalSingleton = new FinalSingleton();

    }

}
