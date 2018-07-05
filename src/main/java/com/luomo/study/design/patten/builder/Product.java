package com.luomo.study.design.patten.builder;

import java.util.ArrayList;
import java.util.List;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class Product {

    List<String> parts = new ArrayList<>();

    /**
     * 添加产品部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 列举所有的产品部件
     */
    public void show(){
        print("产品创建------");
        for(String part : parts){
            print(part);
        }
    }
}
