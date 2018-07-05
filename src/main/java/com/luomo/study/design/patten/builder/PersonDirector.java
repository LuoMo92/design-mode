package com.luomo.study.design.patten.builder;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class PersonDirector {

    private PersonBuilder pb;

    /**
     * 用户告诉指挥者，需要什么样的小人
     * @param pb
     */
    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    /**
     * 根据用户的选择建造小人
     */
    public void createPerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
