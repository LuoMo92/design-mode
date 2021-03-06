package com.luomo.study.design.patten.strategy.price;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public class CalPriceProxy implements InvocationHandler {

    private SortedMap<Integer, Class<? extends CalPrice>> classSortedMap;

    private CalPriceProxy(SortedMap<Integer, Class<? extends CalPrice>> classSortedMap) {
        super();
        this.classSortedMap = classSortedMap;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Double result = 0D;
        if (method.getName().equals("calPrice")) {
            for (Class<? extends CalPrice> clazz : classSortedMap.values()) {
                if (result == 0) {
                    result = (Double) method.invoke(clazz.newInstance(), args);
                } else {
                    result = (Double) method.invoke(clazz.newInstance(), result);
                }
            }
            return result;
        }
        return null;
    }

    public static CalPrice getProxy(SortedMap<Integer,Class<? extends CalPrice>> classSortedMap){
        return (CalPrice) Proxy.newProxyInstance(CalPriceProxy.class.getClassLoader(),new Class[]{CalPrice.class},new CalPriceProxy(classSortedMap));
    }
}
