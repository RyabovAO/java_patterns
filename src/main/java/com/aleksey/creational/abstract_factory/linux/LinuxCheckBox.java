package com.aleksey.creational.abstract_factory.linux;

import com.aleksey.creational.abstract_factory.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Linux checkbox drawing");
    }
}
