package com.aleksey.behavioral.mediator;

public interface User {
    void sendMoney(User name, int money);
    void getMoney();
    String getName();
}
