package com.luomo.study.design.patten.command;

/**
 * @author LiuMei
 * @date 2018-08-15.
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();

}
