package com.aleksey.creational.factory_method;

public class LinuxButtonFactory extends ButtonFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
