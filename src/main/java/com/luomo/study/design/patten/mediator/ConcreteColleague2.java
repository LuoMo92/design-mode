package com.luomo.study.design.patten.mediator;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteColleague2 extends Colleague  {
    /**
     * 构造方法，得到中介者对象
     *
     * @param mediator
     */
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        print("同事2得到消息：" + message);
    }
}
