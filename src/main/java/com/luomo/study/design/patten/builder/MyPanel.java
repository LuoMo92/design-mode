package com.luomo.study.design.patten.builder;

import javax.swing.*;
import java.awt.*;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class MyPanel extends JPanel {

    public void display() {
        this.repaint();
    }

    /**
     * repaint方法会调用paint方法，并自动获得Graphics对像
     * 然后可以用该对像进行2D画图
     * 注：该方法是重写了JPanel的paint方法
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        PersonThinBuilder pb = new PersonThinBuilder(g);
        PersonDirector personDirector = new PersonDirector(pb);
        personDirector.createPerson();
    }

}
