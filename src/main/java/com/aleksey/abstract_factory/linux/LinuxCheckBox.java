package com.aleksey.abstract_factory.linux;

import com.aleksey.abstract_factory.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Linux checkbox drawing");
    }
}
