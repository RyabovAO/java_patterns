package com.aleksey.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        Strategy auto = new AutoRoute();
        Strategy bike = new BikeRoute();
        Strategy walk = new WalkingRoute();

        navigator.setRoute(auto);
        navigator.useRote();
        System.out.println("================");
        navigator.setRoute(bike);
        navigator.useRote();
        System.out.println("================");
        navigator.setRoute(walk);
        navigator.useRote();
    }
}
