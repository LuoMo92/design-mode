package com.luomo.study.design.patten.absfactory;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class AccessDepartment implements IDepartment{

    @Override
    public void insert(Department department){
        print("在Access中给Department表增加一条记录");
    }

}
