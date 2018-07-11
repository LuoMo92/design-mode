package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class RestState extends State {

    @Override
    public void writeProgram(Work work) {
        print("当前时间：" + work.getHour() + "点，下班啦！");
    }
}
