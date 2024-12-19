package com.aleksey.behavioral.state;

public class PhoneUnblocked implements State {
    @Override
    public void doSomething() {
        System.out.println("Пароль введён. Рабочий экран разблокирован");
    }
}
