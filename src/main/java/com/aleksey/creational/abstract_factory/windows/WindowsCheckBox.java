package com.aleksey.creational.abstract_factory.windows;

import com.aleksey.creational.abstract_factory.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Windows checkbox drawing");
    }
}
