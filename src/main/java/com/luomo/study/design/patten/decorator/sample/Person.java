package com.luomo.study.design.patten.decorator.sample;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Person {

    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        print("装扮的" + name);
    }
}
