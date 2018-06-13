package com.luomo.study.design.patten.decorator.normal;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-06-13.
 */
public class Test {

    public static void main(String[] args) {
        Person a = new Person("小A");
        print("第一种装扮");
        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();
        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        a.show();

        print("第二种装扮");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();
        suit.show();
        tie.show();
        leatherShoes.show();
        a.show();
    }

}
