package com.aleksey.behavioral.strategy;

public class BikeRoute implements Strategy {
    @Override
    public void buildRoute() {
        System.out.println("Выстраивает маршрут для вело прогулки");
    }
}
