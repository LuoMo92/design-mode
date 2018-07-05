package com.luomo.study.design.patten.builder;

import javax.swing.*;

/**
 * @author LiuMei
 * @date 2018-07-05.
 */
public class PersonTest {

    public static void main(String[] args){

        JFrame newFrame=new JFrame("person");
        //定义JFrame关闭时的操作（必需），有效避免不能关闭后台当前框体进程的问题
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(400, 400);
        newFrame.setLocation(200, 200);
        newFrame.setVisible(true);
        MyPanel jPanel = new MyPanel();
        newFrame.add(jPanel);
        jPanel.display();
    }

}
