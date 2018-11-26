package com.luomo.study.design.patten.observer;

import java.util.EventObject;

/**
 * @author LiuMei
 * @date 2018-11-26.
 */
public class WriterEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public WriterEvent(Writer source) {
        super(source);
    }

    public Writer getWriter(){
        return (Writer) super.getSource();
    }
}
