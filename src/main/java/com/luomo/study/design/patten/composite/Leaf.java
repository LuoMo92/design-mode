package com.luomo.study.design.patten.composite;

import java.util.Collections;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-17.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    /**
     * 由于叶子没有增加分支，所以add和remove方法没有意思，
     * 这样做可以消除叶节点和枝节点在抽象层次的区别
     * 它们具备完全一致的接口
     * @param c
     */
    @Override
    public void add(Component c) {
        print("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        print("cannot remove from a leaf");
    }

    /**
     * 显示名称和级别
     * @param depth
     */
    @Override
    public void display(int depth) {
        print(String.join("", Collections.nCopies(depth, "-")) + name);
    }
}
