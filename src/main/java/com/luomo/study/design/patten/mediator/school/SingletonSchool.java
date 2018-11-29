package com.luomo.study.design.patten.mediator.school;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class SingletonSchool extends School{

    public SingletonSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "单例宗";
    }

}
