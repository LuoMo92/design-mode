package com.luomo.study.design.patten.state.dota;

/**
 * 英雄类
 *
 * @author LiuMei
 * @date 2018-11-30.
 */
public class Hero {

    /**
     * 正常状态
     */
    public static final RunState COMMON = new CommonState();

    /**
     * 加速状态
     */
    public static final RunState SPEED_UP = new SpeedUpState();

    /**
     * 减速状态
     */
    public static final RunState SPEED_DOWN = new SpeedDownState();

    /**
     * 眩晕状态
     */
    public static final RunState SWIM = new SwimState();

    /**
     * 默认是正常状态
     */
    private RunState state = COMMON;

    /**
     * 跑动线程
     */
    private Thread runThread;

    /**
     * 设置状态
     *
     * @param state
     */
    public void setState(RunState state) {
        this.state = state;
    }

    /**
     * 停止跑动
     */
    public void stopRun() {
        if (isRunning()) {
            runThread.interrupt();
        }
        System.out.println("--------------停止跑动---------------");
    }

    /**
     * 开始跑动
     */
    public void startRun() {
        if (isRunning()) {
            return;
        }
        final Hero hero = this;
        runThread = new Thread(() -> {
            while (!runThread.isInterrupted()) {
                state.run(hero);
            }
        });
        System.out.println("--------------开始跑动---------------");
        runThread.start();
    }

    private boolean isRunning() {
        return runThread != null && !runThread.isInterrupted();
    }
}
