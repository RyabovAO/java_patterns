package com.aleksey.creational.abstract_factory.windows;

import com.aleksey.creational.abstract_factory.Button;
import com.aleksey.creational.abstract_factory.CheckBox;
import com.aleksey.creational.abstract_factory.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
