package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        int hour = work.getHour();
        if(hour < 12){
            print("当前时间：" + hour + "点，精神百倍");
        }else {
            //超过12点，则转入中午工作状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
