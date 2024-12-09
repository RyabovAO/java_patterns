package com.aleksey.abstract_factory.windows;

import com.aleksey.abstract_factory.Button;
import com.aleksey.abstract_factory.CheckBox;
import com.aleksey.abstract_factory.GUIFactory;

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
