package com.luomo.study.design.patten.observer;

import java.lang.reflect.Method;

/**
 * @author LiuMei
 * @date 2018-07-06.
 */
public class Event {

    /**
     * 要执行方法的对象
     */
    private Object object;
    /**
     * 要执行的方法名称
     */
    private String methodName;
    /**
     * 要执行方法的参数
     */
    private Object[] params;
    /**
     * 要执行方法的参数类型
     */
    private Class[] paramTypes;

    public Event() {

    }

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    /**
     * 根据参数数组生成参数类型数组
     *
     * @param params
     */
    private void contractParamTypes(Object[] params) {
        if (params != null && params.length > 0) {
            this.paramTypes = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                this.paramTypes[i] = params[i].getClass();
            }
        }
    }

    public Object getObject() {
        return object;
    }

    /**
     * 执行该 对象的该方法
     *
     * @throws Exception
     */
    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
        if (null == method) {
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }
}
