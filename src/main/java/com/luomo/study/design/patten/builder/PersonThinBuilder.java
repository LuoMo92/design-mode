package com.luomo.study.design.patten.builder;

import java.awt.*;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics g) {
        super(g);
    }

    @Override
    public void buildHead() {
        g.drawOval(50, 20, 30, 30);
    }

    @Override
    public void buildBody() {
        g.drawRect(60,50,10,50);
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(60,50,40,100);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(70,50,90,100);
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(60,100,45,150);

    }

    @Override
    public void buildLegRight() {
        g.drawLine(70,100,85,150);
    }
}
