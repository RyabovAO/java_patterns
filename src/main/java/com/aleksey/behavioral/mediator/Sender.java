package com.aleksey.behavioral.mediator;

public class Sender implements User {
    private Mediator mediator;
    private String name;

    public Sender(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMoney(User name, int money) {
        mediator.takeMoney(name, money);
    }

    @Override
    public void getMoney() {
        mediator.giveMoney(this);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
