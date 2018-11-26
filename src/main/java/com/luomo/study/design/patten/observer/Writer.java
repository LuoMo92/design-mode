package com.luomo.study.design.patten.observer;

import java.util.Observable;

/**
 * 作者类，要继承自被观察者类
 * @author LiuMei
 * @date 2018-11-26.
 */
public class Writer extends Observable {

    /**
     * 作者的名称
     */
    private String name;

    /**
     * 记录作者最新发布的小说
     */
    private String lastNovel;

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    /**
     * 作者发布新小说了，要通知所有关注自己的读者
     * @param novel
     */
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public String getName() {
        return name;
    }

}
