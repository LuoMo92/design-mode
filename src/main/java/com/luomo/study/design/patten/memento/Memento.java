package com.luomo.study.design.patten.memento;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Memento {

    private String state;

    /**
     * 构造方法，将相关数据传入
     * @param state
     */
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
