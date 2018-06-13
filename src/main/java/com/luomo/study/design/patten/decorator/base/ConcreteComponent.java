package com.luomo.study.design.patten.decorator.base;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        print("具体对象的操作");
    }
}
