package com.luomo.study.design.patten.proxy;

/**
 * @author LiuMei
 * @date 2018-06-20.
 */
public class Proxy implements Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
