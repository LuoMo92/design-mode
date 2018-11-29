package com.luomo.study.design.patten.mediator.school;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class MediatorSchool extends School{

    public MediatorSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "中介者神阁";
    }

}
