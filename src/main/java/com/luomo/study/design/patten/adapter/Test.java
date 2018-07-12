package com.luomo.study.design.patten.adapter;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Test {

    public static void main(String[] args){
        Player b = new Forward("巴蒂尔");
        b.attack();
        Player m = new Guards("麦迪");
        m.attack();
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }

}
