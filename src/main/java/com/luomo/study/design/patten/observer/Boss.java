package com.luomo.study.design.patten.observer;

/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public class Boss implements Subject {

    public EventHandler eventHandler = new EventHandler();


    private String state;

    public void setSubjectState(String state) {
        this.state = state;
    }

    @Override
    public void notifyObs() throws Exception {
        this.eventHandler.notifyX();
    }

    @Override
    public String getSubjectState() {
        return state;
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
