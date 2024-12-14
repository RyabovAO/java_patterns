package com.aleksey.fly_weight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeFlyWeightFactory factory = new TreeFlyWeightFactory();
        List<Tree> forest = new ArrayList<>();
        forest.add(new Tree(3, factory.getTreeType("Oak", "Green")));
        forest.add(new Tree(1, factory.getTreeType("Oak", "Green")));
        forest.add(new Tree(4, factory.getTreeType("Oak", "Green")));
        forest.add(new Tree(10, factory.getTreeType("Fir-tree", "Blue")));
        forest.add(new Tree(12, factory.getTreeType("Fir-tree", "Blue")));
        forest.add(new Tree(15, factory.getTreeType("Fir-tree", "Blue")));

        for(Tree tree: forest) {
            tree.plant();
        }
    }
}
