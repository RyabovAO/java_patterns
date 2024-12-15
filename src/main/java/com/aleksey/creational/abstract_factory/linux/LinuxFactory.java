package com.aleksey.creational.abstract_factory.linux;

import com.aleksey.creational.abstract_factory.Button;
import com.aleksey.creational.abstract_factory.CheckBox;
import com.aleksey.creational.abstract_factory.GUIFactory;

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
