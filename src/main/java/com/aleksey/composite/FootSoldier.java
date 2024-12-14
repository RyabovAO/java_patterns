package com.aleksey.composite;

public class FootSoldier implements Soldier {
    @Override
    public void lineUp() {
        System.out.println("Foot soldier in place");
    }

    @Override
    public void followOrder() {
        System.out.println("Foot soldier follow order");
    }
}
