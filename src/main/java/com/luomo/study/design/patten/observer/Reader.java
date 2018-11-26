package com.luomo.study.design.patten.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 读者类，要实现观察者接口
 * @author LiuMei
 * @date 2018-11-26.
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * 读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
     * @param writerName
     */
    public void subscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    /**
     * 读者取消关注某位作者
     * @param writerName
     */
    public void unsubscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    /**
     * 当关注的作者发表新小说时，会通知读者去看
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name+"知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
        }
    }
}
