package com.aleksey.factory_method;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }
}
