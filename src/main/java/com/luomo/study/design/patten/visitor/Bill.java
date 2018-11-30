package com.luomo.study.design.patten.visitor;

/**
 * 单个单子的接口（相当于Element）
 * @author LiuMei
 * @date 2018-11-30.
 */
public interface Bill {

    void accept(Viewer viewer);

}
