package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        int hour = work.getHour();
        if(hour < 13){
            print("当前时间：" + hour + "点，该吃饭了");
        }else {
            //超过13点，则转入下午工作状态
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
