package com.luomo.study.design.patten.mediator.school;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class StrategySchool extends School{

    public StrategySchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "策略宫";
    }

}
