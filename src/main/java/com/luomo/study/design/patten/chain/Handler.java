package com.luomo.study.design.patten.chain;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public abstract class Handler {

    protected Handler successor;

    /**
     * 设置继任者
     * @param successor
     */
    public void  setSuccessor(Handler successor){
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handleRequest(int request);
}
