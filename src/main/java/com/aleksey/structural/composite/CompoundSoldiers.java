package com.aleksey.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundSoldiers implements Soldier {
    protected List<Soldier> soldierList = new ArrayList<>();

    public void addSolder(Soldier s) {
        soldierList.add(s);
    }

    @Override
    public void lineUp() {
        for (Soldier s: soldierList) {
            s.lineUp();
        }
    }

    @Override
    public void followOrder() {
        for (Soldier s: soldierList) {
            s.followOrder();
        }
    }
}
