package com.luomo.study.design.patten.facade;

/**
 * @author LiuMei
 * @date 2018-07-04.
 */
public class Test {

    public static void main(String[] args){
        //由于Facade的作用，客户端可以根本不知道单个子系统类的存在
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
