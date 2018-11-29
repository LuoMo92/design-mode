package com.luomo.study.design.patten.flyweight.hero;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class Lion extends AbstractHero{

    @Override
    public String getName() {
        return "恶魔巫师";
    }

    @Override
    public void initSkills() {
        skills[0] = "穿刺";
        skills[1] = "妖术";
        skills[2] = "法力汲取";
        skills[3] = "死亡一指";
    }

}
