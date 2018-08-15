package com.luomo.study.design.patten.command;

/**
 * @author LiuMei
 * @date 2018-08-15.
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
