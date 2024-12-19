package com.aleksey.behavioral.state;

public class PhoneUse implements State {
    @Override
    public void doSomething() {
        System.out.println("Телефон используется");
    }
}
