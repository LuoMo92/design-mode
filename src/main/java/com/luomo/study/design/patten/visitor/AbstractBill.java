package com.luomo.study.design.patten.visitor;

/**
 * 抽象单子类，一个高层次的单子抽象
 * @author LiuMei
 * @date 2018-11-30.
 */
public abstract class AbstractBill implements Bill{

    protected double amount;

    protected String item;

    public AbstractBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
