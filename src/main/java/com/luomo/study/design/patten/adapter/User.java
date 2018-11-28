package com.luomo.study.design.patten.adapter;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public class User extends BaseObservableEntity{
    private Integer id;
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
