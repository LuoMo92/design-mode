package com.luomo.study.design.patten.observer.button;

import java.util.EventObject;

/**
 * @author LiuMei
 * @date 2018-11-26.
 */
public abstract class ButtonEvent  extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonEvent(Object source) {
        super(source);
    }

    public Button getButton(){
        return (Button) super.getSource();
    }
}

/**
 * 点击事件
 */
class ClickEvent extends ButtonEvent{

    public ClickEvent(Object source) {
        super(source);
    }

}

/**
 * 双击事件
 */
class DblClickEvent extends ButtonEvent{

    public DblClickEvent(Object source) {
        super(source);
    }

}

/**
 * 鼠标移动事件
 */
class MouseMoveEvent extends ButtonEvent{
    /**
     * 鼠标移动事件比较特殊，因为它需要告诉监听器鼠标当前的坐标是在哪，我们记录为x,y
     */
    private int x;
    private int y;

    public MouseMoveEvent(Object source, int x, int y) {
        super(source);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}