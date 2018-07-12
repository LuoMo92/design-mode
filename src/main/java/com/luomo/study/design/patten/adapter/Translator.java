package com.luomo.study.design.patten.adapter;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Translator extends Player {

    private ChineseCenter chineseCenter = new ChineseCenter();

    public Translator(String name) {
        super(name);
        chineseCenter.setName(name);
    }

    @Override
    public void attack() {
        chineseCenter.进攻();
    }

    @Override
    public void defense() {
        chineseCenter.防守();
    }
}
