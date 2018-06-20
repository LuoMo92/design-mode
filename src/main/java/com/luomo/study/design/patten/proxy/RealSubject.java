package com.luomo.study.design.patten.proxy;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-20.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        print("真实的请求");
    }
}
