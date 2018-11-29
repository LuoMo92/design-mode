package com.luomo.study.design.patten.chain.mc;

/**
 * 分店接口（相当于Handler）
 * @author LiuMei
 * @date 2018-11-29.
 */
public interface Subbranch {

    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);

}
