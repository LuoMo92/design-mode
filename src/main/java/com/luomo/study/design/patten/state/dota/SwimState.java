package com.luomo.study.design.patten.state.dota;

/**
 * @author LiuMei
 * @date 2018-11-30.
 */
public class SwimState implements RunState{

    @Override
    public void run(Hero hero) {
        System.out.println("--------------不能跑动---------------");
        try {
            //假设眩晕持续2秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------眩晕状态结束，变为正常状态------");
    }

}
