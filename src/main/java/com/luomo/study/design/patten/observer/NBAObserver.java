package com.luomo.study.design.patten.observer;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public class NBAObserver {

    private String name;
    private Subject subject;

    public NBAObserver(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void closeNBA(){
        print(subject.getSubjectState()+"  "+name+"关闭NBA直播，继续工作");
    }

}
