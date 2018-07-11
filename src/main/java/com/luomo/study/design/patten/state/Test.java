package com.luomo.study.design.patten.state;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class Test {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);

        work.setFinish(false);
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }

}
