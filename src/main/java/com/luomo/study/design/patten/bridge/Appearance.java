package com.luomo.study.design.patten.bridge;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */

/**
 * 外貌接口
 */
public interface Appearance {

    void show();

}

/**
 * 屌丝外形
 */
class Loser implements Appearance{

    @Override
    public void show() {
        System.out.println("展示屌丝形象");
    }

}

/**
 * 高富帅外形
 */
class TRH implements Appearance{

    @Override
    public void show() {
        System.out.println("展示高富帅形象");
    }

}
