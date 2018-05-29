package com.luomo.study.design.patten.singleton;

/**
 * @author LiuMei
 * @date 2017-11-24.
 */
public class Singleton {

    /**
     * 一个静态的实例
     */
    private static Singleton singleton;

    /**
     * 私有化构造函数
     */
    private Singleton(){}

    /**
     * 给出一个公共的静态方法返回一个单一实例
     * @return
     */
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
