package com.luomo.study.design.patten.prototype;

/**
 * @author LiuMei
 * @date 2018-11-30.
 */
public class Field implements Cloneable{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    protected Field clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Field) object;
    }

}
