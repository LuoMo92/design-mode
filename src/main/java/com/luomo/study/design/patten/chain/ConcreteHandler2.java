package com.luomo.study.design.patten.chain;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        //10-20处理此请求
        if (request >= 10 && request < 20) {
            print(this.getClass().getName() + "处理请求" + request);
        } else {
            //转移到下一位
            successor.handleRequest(request);
        }
    }
}
