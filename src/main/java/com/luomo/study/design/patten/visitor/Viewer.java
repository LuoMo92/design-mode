package com.luomo.study.design.patten.visitor;

/**
 * 超级访问者接口（它支持定义高层操作）
 * @author LiuMei
 * @date 2018-11-30.
 */
public interface Viewer{

    void viewAbstractBill(AbstractBill bill);

}
