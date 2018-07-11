package com.luomo.study.design.patten.absfactory;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class DataAccess {

    private static final String fullName = "com.luomo.study.design.patten.absfactory.";

    private static final String db = "Access";

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName(fullName+db+"User");
        return (IUser) cls.newInstance();
    }

    public static IDepartment createDepartment() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<?> cls = Class.forName(fullName+db+"Department");
        return (IDepartment) cls.newInstance();
    }
}
