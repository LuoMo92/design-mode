package com.luomo.study.design.patten.flyweight.hero;

/**
 * 抽象英雄基类
 * @author LiuMei
 * @date 2018-11-29.
 */
public abstract class AbstractHero {

    /**
     * 英雄名称
     */
    protected final String name;

    /**
     * 每个英雄都有四个技能
     */
    protected final String[] skills = new String[4];

    public AbstractHero() {
        super();
        this.name = getName();
        initSkills();
        checkSkills();
    }

    private void checkSkills(){
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] == null) {
                throw new NullPointerException();
            }
        }
    }

    /**
     * 释放技能
     * @param index
     */
    public void release(int index){
        if (index < 0) {
            index = 0;
        }else if (index > 3) {
            index = 3;
        }
        System.out.println(name + "释放" + skills[index]);
    }

    /**
     * 物理攻击
     */
    public void commonAttack(){
        System.out.println(name + "进行物理攻击");
    }

    public abstract String getName();

    public abstract void initSkills();

}