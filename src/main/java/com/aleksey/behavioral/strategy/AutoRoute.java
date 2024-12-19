package com.aleksey.behavioral.strategy;

public class AutoRoute implements Strategy {
    @Override
    public void buildRoute() {
        System.out.println("Выстраивает маршрут для авто");
    }
}
