package com.luomo.study.design.patten.builder.soul;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public interface DoppelgangerBuilder {

    void createDoppelganger(String name);

    void buildBody();

    void buildHead();

    void buildLeftArm();

    void buildLeftHand();

    void buildRightArm();

    void buildRightHand();

    void buildLeftLeg();

    void buildLeftFoot();

    void buildRightLeg();

    void buildRightFoot();

    Doppelganger getDoppelganger();

}
