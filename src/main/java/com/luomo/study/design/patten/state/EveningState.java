package com.luomo.study.design.patten.state;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        int hour = work.getHour();
        if(work.isFinish()){
            //工作完成，进入下班状态
            work.setState(new RestState());
            work.writeProgram();
        }else {
            if(hour < 21){
                print("当前时间：" + hour + "点，加班，累！");
            }else {
                //超过21点，进入睡眠状态
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
