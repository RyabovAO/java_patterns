package com.aleksey;

import com.aleksey.factory_method.Button;
import com.aleksey.factory_method.ButtonFactory;
import com.aleksey.factory_method.LinuxButtonFactory;
import com.aleksey.factory_method.WinButtonFactory;

public class Main {
    public static void main(String[] args) {
        ButtonFactory bf = createButtonFactory("Win");
        Button button = bf.createButton();
        button.render();
    }

    public static ButtonFactory createButtonFactory(String os) {
        switch (os) {
            case "Win":
                return new WinButtonFactory();
            case "Linux":
                return new LinuxButtonFactory();
            default:
                throw new RuntimeException(os + " unknown OS");
        }
    }
}