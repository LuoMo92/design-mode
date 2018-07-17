package com.luomo.study.design.patten.composite;

/**
 * @author LiuMei
 * @date 2018-07-17.
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    /**
     * 增加树枝
     * @param c
     */
    public abstract void add(Component c);

    /**
     * 移除树枝
     * @param c
     */
    public abstract void remove(Component c);

    public abstract void display(int depth);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
