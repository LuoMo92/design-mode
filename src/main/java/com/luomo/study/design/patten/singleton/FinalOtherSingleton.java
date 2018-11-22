package com.luomo.study.design.patten.singleton;

/**
 * 俗称的饿汉式加载
 * 不建议使用
 *
 * 上述方式与我们最后一种给出的方式类似，只不过没有经过内部类处理，
 * 这种方式最主要的缺点就是一旦我访问了Singleton的任何其他的静态域，就会造成实例的初始化，
 * 而事实是可能我们从始至终就没有使用这个实例，造成内存的浪费。
 *
 * @author LiuMei
 * @date 2018-11-22.
 */
public class FinalOtherSingleton {

    private static FinalOtherSingleton singleton = new FinalOtherSingleton();

    private FinalOtherSingleton(){}

    public static FinalOtherSingleton getInstance(){
        return singleton;
    }

}
