package com.luomo.study.design.patten.template;

import static com.luomo.study.design.patten.util.Print.print;
/**
 * @author LiuMei
 * @date 2018-07-03.
 */
public class Test {

    public static void main(String[] args) {
        print("学生A的试卷");
        //将子类变量声明成父类，利用多态性，实现代码的复用
        TestPaper a = new TestPaperA();
        a.question1();
        a.question2();

        print("学生B的试卷");
        TestPaper b = new TestPaperB();
        b.question1();
        b.question2();
    }

}
