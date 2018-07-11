package com.luomo.study.design.patten.observer;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public class StockObserver {

    private String name;
    private Subject subject;

    public StockObserver(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarket(){
        print(subject.getSubjectState()+"  "+name+"关闭股票行情，继续工作");
    }

}
