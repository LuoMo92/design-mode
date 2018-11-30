package com.luomo.study.design.patten.visitor;

/**
 * 账单查看者接口（相当于Visitor）
 * @author LiuMei
 * @date 2018-11-30.
 */
public interface AccountBookViewer {

    /**
     * 查看消费的单子
     * @param bill
     */
    void view(ConsumeBill bill);

    /**
     * 查看收入的单子
     * @param bill
     */
    void view(IncomeBill bill);

}
