package com.luomo.study.design.patten.decorator.base;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public abstract class Decorator implements Component {

    protected Component component;

    /**
     * 重写operation()
     * 实际执行的是Component的operation()
     */
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
