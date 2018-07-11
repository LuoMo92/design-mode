package com.luomo.study.design.patten.observer;


/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public interface Subject {

    /**
     * 通知观察者
     */
    void notifyObs() throws Exception;

    String getSubjectState();
}
