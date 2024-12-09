package com.aleksey.abstract_factory.windows;

import com.aleksey.abstract_factory.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Windows checkbox drawing");
    }
}
