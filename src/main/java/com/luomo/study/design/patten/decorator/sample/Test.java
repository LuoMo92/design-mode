package com.luomo.study.design.patten.decorator.sample;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Test {

    public static void main(String[] args) {
        Person a = new Person("小A");
        print("第一种装扮");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.decorate(a);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        print("第二种装扮");
        LeatherShoes leatherShoes = new LeatherShoes();
        Suit suit = new Suit();
        Tie tie = new Tie();
        leatherShoes.decorate(a);
        suit.decorate(leatherShoes);
        tie.decorate(suit);
        tie.show();
    }

}
