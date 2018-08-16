package com.luomo.study.design.patten.chain;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        //0-10处理此请求
        if (request >= 0 && request < 10) {
            print(this.getClass().getName() + "处理请求" + request);
        } else {
            //转移到下一位
            successor.handleRequest(request);
        }
    }
}
