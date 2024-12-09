package com.aleksey.abstract_factory.linux;

import com.aleksey.abstract_factory.Button;
import com.aleksey.abstract_factory.CheckBox;
import com.aleksey.abstract_factory.GUIFactory;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
