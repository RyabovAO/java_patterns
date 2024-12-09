package com.aleksey.abstract_factory.windows;

import com.aleksey.abstract_factory.Button;

public class WindowsButton implements Button {
    @Override
    public void display() {
        System.out.println("Windows button displayed");
    }
}
