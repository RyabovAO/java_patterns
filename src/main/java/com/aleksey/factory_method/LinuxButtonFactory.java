package com.aleksey.factory_method;

public class LinuxButtonFactory extends ButtonFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
