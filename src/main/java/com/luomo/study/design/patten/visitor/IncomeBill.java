package com.luomo.study.design.patten.visitor;

/**
 * 收入单子
 * @author LiuMei
 * @date 2018-11-30.
 */
public class IncomeBill extends AbstractBill{

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}
