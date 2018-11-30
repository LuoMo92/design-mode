package com.luomo.study.design.patten.visitor;

/**
 * 老板类，查看账本的类之一，作用于最低层次结构
 * @author LiuMei
 * @date 2018-11-30.
 */
public class Boss extends AbstractViewer{

    private double totalIncome;

    private double totalConsume;

    /**
     * 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
     * @param bill
     */
    @Override
    public void viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }

}