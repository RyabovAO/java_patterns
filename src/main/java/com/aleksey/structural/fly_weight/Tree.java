package com.aleksey.structural.fly_weight;

public class Tree {
    private int place;
    private TreeType treeType;

    public Tree(int place, TreeType treeType) {
        this.place = place;
        this.treeType = treeType;
    }

    public void plant() {
        System.out.println("plant " + treeType.getName() + " in place # " + place);
    }
}
