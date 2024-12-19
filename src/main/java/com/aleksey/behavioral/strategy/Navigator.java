package com.aleksey.behavioral.strategy;

public class Navigator {
    private Strategy route;

    public void setRoute(Strategy route) {
        this.route = route;
    }

    public void useRote() {
        this.route.buildRoute();
    }
}
