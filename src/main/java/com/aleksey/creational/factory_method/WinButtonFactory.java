package com.aleksey.creational.factory_method;

public class WinButtonFactory extends ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
