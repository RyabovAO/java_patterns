package com.aleksey.structural.bridge;

public class BlackColor implements Color {
    @Override
    public void paint() {
        System.out.println("Shape is painted black");
    }
}
