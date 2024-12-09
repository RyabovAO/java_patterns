package com.aleksey;

import com.aleksey.abstract_factory.Button;
import com.aleksey.abstract_factory.CheckBox;
import com.aleksey.abstract_factory.GUIFactory;
import com.aleksey.abstract_factory.windows.WindowsFactory;
import com.aleksey.factory_method.ButtonFactory;
import com.aleksey.factory_method.LinuxButtonFactory;
import com.aleksey.factory_method.WinButtonFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.display();
        checkBox.draw();
    }

//    public static ButtonFactory createButtonFactory(String os) {
//        switch (os) {
//            case "Win":
//                return new WinButtonFactory();
//            case "Linux":
//                return new LinuxButtonFactory();
//            default:
//                throw new RuntimeException(os + " unknown OS");
//        }
//    }
}