package com.aleksey.creational.abstract_factory.windows;

import com.aleksey.creational.abstract_factory.Button;

public class WindowsButton implements Button {
    @Override
    public void display() {
        System.out.println("Windows button displayed");
    }
}
