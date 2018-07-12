package com.luomo.study.design.patten.memento;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
