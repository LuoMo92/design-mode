package com.luomo.study.design.patten.memento;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Originator {

    /**
     * 需要保存的属性，可能有多个
     */
    private String state;

    /**
     * 创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录，将Memento导入并将相关数据恢复
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        print("State=" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
