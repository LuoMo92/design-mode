package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class SleepingState extends State {

    @Override
    public void writeProgram(Work work) {
        int hour = work.getHour();
        print("当前时间：" + hour + "点，不行了，睡着了！");
    }
}
