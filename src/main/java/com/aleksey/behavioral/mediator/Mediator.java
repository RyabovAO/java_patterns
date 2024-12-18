package com.aleksey.behavioral.mediator;

public interface Mediator {
    void takeMoney(User user, int money);
    void giveMoney(User user);
}
