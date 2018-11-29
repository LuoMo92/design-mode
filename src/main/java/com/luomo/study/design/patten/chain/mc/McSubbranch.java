package com.luomo.study.design.patten.chain.mc;

import java.util.Collections;
import java.util.Map;

/**
 * 麦当劳分店
 * @author LiuMei
 * @date 2018-11-29.
 */
public class McSubbranch implements Subbranch{

    /**
     * 假设是500米以内送餐
     */
    private final static int MIN_DISTANCE = 500;

    /**
     * 类计数
     */
    private static int count;

    /**
     * 分店号
     */
    private final int number;

    /**
     * 分店的横坐标，用于判断距离
     */
    private int x;

    /**
     * 分店的纵坐标，用于判断距离
     */
    private int y;

    /**
     * 菜单
     */
    private Map<String, Integer> menu;

    /**
     * 下一家分店
     */
    private Subbranch nextSubbranch;

    public McSubbranch(int x, int y, Map<String, Integer> menu) {
        super();
        this.x = x;
        this.y = y;
        this.menu = menu;
        number = ++count;
    }

    public boolean order(int x,int y,Map<String, Integer> order){
        //如果距离小于500米并且订单中的食物不缺货，则订单成功，否则失败
        if (CommonUtils.getDistance(x, y, this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order)) {
            for (String name : order.keySet()) {
                menu.put(name, menu.get(name) - order.get(name));
            }
            return true;
        }else {
            return false;
        }
    }

    public Map<String, Integer> getMenu() {
        return Collections.unmodifiableMap(menu);
    }

    @Override
    public String toString() {
        return "麦当劳分店第" + number + "个";
    }

    /**
     * 设置下一家分店
     * @param subbranch
     */
    @Override
    public void setSuccessor(Subbranch subbranch) {
        this.nextSubbranch = subbranch;
    }

    @Override
    public boolean handleOrder(Order order) {
        //如果距离小于500米并且订单中的食物不缺货，则订单成功，否则失败
        if (CommonUtils.getDistance(order.getX(), order.getY(), this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order.getOrder())) {
            for (String name : order.getOrder().keySet()) {
                menu.put(name, menu.get(name) - order.getOrder().get(name));
            }
            System.out.println("订餐成功，接受订单的分店是：" + this);
            return true;
        }
        if (nextSubbranch == null) {
            return false;
        }
        return nextSubbranch.handleOrder(order);
    }

    public Subbranch getNextSubbranch() {
        return nextSubbranch;
    }
}
