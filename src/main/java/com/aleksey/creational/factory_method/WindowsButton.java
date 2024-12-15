package com.aleksey.creational.factory_method;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }
}
