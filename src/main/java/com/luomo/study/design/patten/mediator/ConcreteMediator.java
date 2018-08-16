package com.luomo.study.design.patten.mediator;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteMediator extends Mediator {

    /**
     * 需要了解所有的具体同事对象
     */
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        //重写发送信息的方法，根据对象做出选择判断，通知对象
        if(colleague == concreteColleague1){
            concreteColleague2.notify(message);
        }else {
            concreteColleague1.notify(message);
        }
    }
}
