package com.aleksey.composite;

public class Mariner implements Soldier {
    @Override
    public void lineUp() {
        System.out.println("Mariner in place");
    }

    @Override
    public void followOrder() {
        System.out.println("Mariner follow order");
    }
}
