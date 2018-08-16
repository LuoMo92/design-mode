package com.luomo.study.design.patten.flyweight;

import java.util.Hashtable;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    /**
     * 初始化工厂时，先生成三个实例
     */
    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    /**
     * 根据客户端请求，获得已生成的实例
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        return (Flyweight) flyweights.get(key);
    }
}
