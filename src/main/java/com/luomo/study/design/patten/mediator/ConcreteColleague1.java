package com.luomo.study.design.patten.mediator;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-08-16.
 */
public class ConcreteColleague1 extends Colleague {
    /**
     * 构造方法，得到中介者对象
     *
     * @param mediator
     */
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    /**
     * 发送信息时通常是中介者发送的
     * @param message
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        print("同事1得到消息：" + message);
    }
}
