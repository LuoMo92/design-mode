package com.luomo.study.design.patten.state.dota;

/**
 * @author LiuMei
 * @date 2018-11-30.
 */
public class SpeedUpState implements RunState{

    @Override
    public void run(Hero hero) {
        System.out.println("--------------加速跑动---------------");
        try {
            //假设加速持续4秒
            Thread.sleep(4000);
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------加速状态结束，变为正常状态------");
    }

}
