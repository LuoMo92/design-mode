package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work work) {
        int hour = work.getHour();
        if(hour < 17){
            print("当前时间：" + hour + "点，下午状态还不错，加油！");
        }else {
            //超过17点，则转入傍晚工作状态
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
