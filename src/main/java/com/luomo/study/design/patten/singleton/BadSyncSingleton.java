package com.luomo.study.design.patten.singleton;

/**
 * @author LiuMei
 * @date 2017-11-24.
 */
public class BadSyncSingleton {

    /**
     * 一个静态的实例
     */
    private static BadSyncSingleton singleton;

    /**
     * 私有化构造函数
     */
    private BadSyncSingleton(){}

    /**
     * 给出一个公共的静态方法返回一个单一实例
     *
     * 整个获取实例的方法同步
     * 同步的地方只是需要发生在单例的实例还未创建的时候
     * @return
     */
    public static synchronized BadSyncSingleton getInstance(){
        if(singleton == null){
            singleton = new BadSyncSingleton();
        }
        return singleton;
    }

}
