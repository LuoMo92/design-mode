package com.luomo.study.design.patten.proxy;

import java.sql.Connection;

/**
 * @author LiuMei
 * @date 2017-11-27.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Connection connection = DataSource.getInstance().getConnection();
        connection.close();
    }

}
