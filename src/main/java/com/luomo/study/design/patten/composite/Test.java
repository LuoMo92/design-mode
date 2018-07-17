package com.luomo.study.design.patten.composite;

/**
 * @author LiuMei
 * @date 2018-07-17.
 */
public class Test {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("LeafA"));
        root.add(new Leaf("LeafB"));

        Composite composite1 = new Composite("CompositeX");
        composite1.add(new Leaf("LeafC"));
        composite1.add(new Leaf("LeafD"));
        root.add(composite1);

        Composite composite2 = new Composite("CompositeY");
        root.add(composite2);

        root.display(1);
    }

}
