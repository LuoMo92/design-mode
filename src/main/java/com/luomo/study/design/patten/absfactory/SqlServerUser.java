package com.luomo.study.design.patten.absfactory;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class SqlServerUser implements IUser{

    @Override
    public void insert(User user){
        print("在SQL Server中给User表增加一条记录");
    }

}
