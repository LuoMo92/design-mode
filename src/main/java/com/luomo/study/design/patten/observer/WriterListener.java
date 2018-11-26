package com.luomo.study.design.patten.observer;

import java.util.EventListener;

/**
 * @author LiuMei
 * @date 2018-11-26.
 */
public interface WriterListener extends EventListener {

    void addNovel(WriterEvent writerEvent);

}
