package com.luomo.study.design.patten.adapter;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class ChineseCenter {

    private String name;

    public void 进攻(){
        print("中文中锋"+this.getName()+"进攻");
    }

    public void 防守(){
        print("中文中锋"+this.getName()+"防守");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
