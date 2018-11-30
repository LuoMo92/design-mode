package com.luomo.study.design.patten.visitor;

/**
 * 比Viewer接口低一个层次的访问者接口
 * @author LiuMei
 * @date 2018-11-30.
 */
public abstract class AbstractViewer implements Viewer{

    /**
     * 查看消费的单子
     * @param bill
     */
    abstract void viewConsumeBill(ConsumeBill bill);

    /**
     * 查看收入的单子
     * @param bill
     */
    abstract void viewIncomeBill(IncomeBill bill);

    @Override
    public final void viewAbstractBill(AbstractBill bill){}
}
