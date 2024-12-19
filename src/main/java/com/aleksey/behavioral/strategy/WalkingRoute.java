package com.aleksey.behavioral.strategy;

public class WalkingRoute implements Strategy {
    @Override
    public void buildRoute() {
        System.out.println("Выстраивает маршрут для пешей прогулки");
    }
}
