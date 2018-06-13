package com.luomo.study.design.patten.decorator.sample;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
