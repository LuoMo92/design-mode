package com.luomo.study.design.patten.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-17.
 */
public class Composite extends Component {

    /**
     * 用来存储下属的枝节点和叶节点
     */
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        print(String.join("", Collections.nCopies(depth, "-")) + name);
        for(Component c : children){
            c.display(depth+2);
        }
    }
}
