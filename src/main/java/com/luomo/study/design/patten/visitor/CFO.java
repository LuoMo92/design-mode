package com.luomo.study.design.patten.visitor;

/**
 * 财务主管类，查看账本的类之一，作用于高层的层次结构
 * @author LiuMei
 * @date 2018-11-30.
 */
public class CFO implements Viewer {

    /**
     * 财务主管对每一个单子都要核对项目和金额
     * @param bill
     */
    @Override
    public void viewAbstractBill(AbstractBill bill) {
        System.out.println("财务主管查看账本时，每一个都核对项目和金额，金额是" + bill.getAmount() + "，项目是" + bill.getItem());
    }

}
