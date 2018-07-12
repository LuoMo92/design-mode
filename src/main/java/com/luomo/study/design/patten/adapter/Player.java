package com.luomo.study.design.patten.adapter;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public abstract class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }

    /**
     * 进攻方法
     */
    public abstract void attack();

    /**
     * 防守方法
     */
    public abstract void defense();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
