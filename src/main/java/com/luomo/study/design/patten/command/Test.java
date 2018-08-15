package com.luomo.study.design.patten.command;

/**
 * @author LiuMei
 * @date 2018-08-15.
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
