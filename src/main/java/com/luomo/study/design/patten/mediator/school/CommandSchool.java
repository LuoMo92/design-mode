package com.luomo.study.design.patten.mediator.school;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class CommandSchool extends School{

    public CommandSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "命令门";
    }

}
