package com.aleksey.behavioral.state;

public class PhoneOff implements State {
    @Override
    public void doSomething() {
        System.out.println("Телефон выключен");
    }
}
