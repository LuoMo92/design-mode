package com.luomo.study.design.patten.chain;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class Test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        //设置职责链上家与下家
        handler1.setSuccessor(handler2);

        int[] requests = {2, 5, 10, 12};
        for (int i = 0; i < requests.length; i++) {
            handler1.handleRequest(requests[i]);
        }
    }

}
