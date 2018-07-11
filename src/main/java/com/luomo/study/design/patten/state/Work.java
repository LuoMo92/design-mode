package com.luomo.study.design.patten.state;

/**
 * @author LiuMei
 * @date 2018-07-11.
 */
public class Work {

    private State state;

    private int hour;

    private boolean finish = false;

    public Work() {
        state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
