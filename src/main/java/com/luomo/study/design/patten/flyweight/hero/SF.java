package com.luomo.study.design.patten.flyweight.hero;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class SF extends AbstractHero {

    @Override
    public String getName() {
        return "影魔";
    }

    @Override
    public void initSkills() {
        skills[0] = "毁灭阴影";
        skills[1] = "支配死灵";
        skills[2] = "魔王降临";
        skills[3] = "魂之挽歌";
    }

}
