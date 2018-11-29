package com.luomo.study.design.patten.mediator.school;

/**
 * 模式联盟--中介者接口
 *
 * @author LiuMei
 * @date 2018-11-29.
 */
public interface IPatternAlliance {

    /**
     * 加入联盟
     * @param school
     */
    void add(School school);

    /**
     * 联盟攻击
     * @param activeSide
     * @param passiveSide
     */
    void resolveAttack(School activeSide, School passiveSide);

    /**
     * 联盟防御
     * @param passiveSide
     */
    void resolveDefense(School passiveSide);

}
