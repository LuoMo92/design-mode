package com.luomo.study.design.patten.observer;

/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //创建一个老板通知者
        Boss boss = new Boss();
        boss.setSubjectState("哈哈哈");
        StockObserver stockObserver = new StockObserver("A",boss);
        NBAObserver nbaObserver = new NBAObserver("B",boss);
        boss.eventHandler.addEvent(stockObserver,"closeStockMarket",null);
        boss.eventHandler.addEvent(nbaObserver,"closeNBA",null);
        boss.notifyObs();
    }

}
