package com.luomo.study.design.patten.command;

/**
 * @author LiuMei
 * @date 2018-08-15.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }

}
