package com.luomo.study.design.patten.bridge;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class Doppelganger extends Soul{

    public Doppelganger(){
        System.out.println("制作一个暂无外貌和技能的分身");
    }

    @Override
    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

}
