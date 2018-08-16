package com.luomo.study.design.patten.mediator;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class Test {

    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        //让两个具体同事类认识中介者对象
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        //让中介者认识各个具体同事类对象
        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        //具体同事类对象的发送信息都是通过中介者转发
        concreteColleague1.send("吃饭了吗");
        concreteColleague2.send("没呢");
    }

}
