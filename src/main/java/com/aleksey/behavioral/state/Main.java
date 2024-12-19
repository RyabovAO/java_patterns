package com.aleksey.behavioral.state;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        State off =new PhoneOff();

        phone.setState(off);

        for (int i = 0; i < 10; i++) {
            phone.doSomething();
            phone.usePhone();
        }
    }
}
