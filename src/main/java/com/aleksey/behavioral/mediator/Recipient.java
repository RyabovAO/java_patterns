package com.aleksey.behavioral.mediator;

public class Recipient implements User {
    private Mediator mediator;
    private String name;

    public Recipient(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMoney(User name, int money) {
        mediator.remittance(name, money);
    }

    @Override
    public void getMoney() {
        System.out.println("Клиент " + this.name + "получил перевод");
    }

    @Override
    public String getName() {
        return this.name;
    }
}