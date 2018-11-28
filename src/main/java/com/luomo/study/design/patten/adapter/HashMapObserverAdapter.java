package com.luomo.study.design.patten.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public class HashMapObserverAdapter<K, V> extends HashMap<K, V> implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        //被观察者变化时，清空Map
        super.clear();
    }

}