package com.luomo.study.design.patten.absfactory;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class SqlServerDepartment implements IDepartment{

    @Override
    public void insert(Department department){
        print("在SQL Server中给Department表增加一条记录");
    }

}
