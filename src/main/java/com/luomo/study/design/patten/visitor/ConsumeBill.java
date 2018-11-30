package com.luomo.study.design.patten.visitor;

/**
 * 消费的单子
 * @author LiuMei
 * @date 2018-11-30.
 */
public class ConsumeBill extends AbstractBill{

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}
