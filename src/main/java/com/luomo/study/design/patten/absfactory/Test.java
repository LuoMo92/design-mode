package com.luomo.study.design.patten.absfactory;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        User user = new User();
        IUser userFactory = DataAccess.createUser();
        userFactory.insert(user);
    }

}
