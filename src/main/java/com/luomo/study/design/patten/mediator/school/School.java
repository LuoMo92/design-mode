package com.luomo.study.design.patten.mediator.school;

/**
 * 门派抽象类
 * @author LiuMei
 * @date 2018-11-29.
 */
public abstract class School {

    protected IPatternAlliance patternAlliance;

    public School(IPatternAlliance patternAlliance) {
        super();
        this.patternAlliance = patternAlliance;
    }

    public void defense() {
        System.out.println(getName() + "防御");
    }

    public void attack(School school) {
        System.out.println(getName() + "攻击" + school.getName());
    }

    //有了中介者，将由中介者处理
    public void attackByPatternAlliance(School school){
        patternAlliance.resolveAttack(this, school);
    }

    public void defenseByPatternAlliance(){
        patternAlliance.resolveDefense(this);
    }

    public abstract String getName();

}
