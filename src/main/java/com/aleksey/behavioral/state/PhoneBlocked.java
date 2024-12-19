package com.aleksey.behavioral.state;

public class PhoneBlocked implements State {
    @Override
    public void doSomething() {
        System.out.println("Блокировка экрана. Введите пароль");
    }
}
