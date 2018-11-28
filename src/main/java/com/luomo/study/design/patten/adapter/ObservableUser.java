package com.luomo.study.design.patten.adapter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
/**
 * 继承User,组合Observable
 */
public class ObservableUser extends User{

    private Observable observable = new Observable();

    public synchronized void addObserver(Observer o) {
        observable.addObserver(o);
    }

    public synchronized void deleteObserver(Observer o) {
        observable.deleteObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void notifyObservers(Object arg) {
        observable.notifyObservers(arg);
    }

    public synchronized void deleteObservers() {
        observable.deleteObservers();
    }

//    protected synchronized void setChanged() {
//        observable.setChanged();
//    }
//
//    protected synchronized void clearChanged() {
//        observable.clearChanged();
//    }

    public synchronized boolean hasChanged() {
        return observable.hasChanged();
    }

    public synchronized int countObservers() {
        return observable.countObservers();
    }


}
