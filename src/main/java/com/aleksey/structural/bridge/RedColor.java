package com.aleksey.structural.bridge;

public class RedColor implements Color {
    @Override
    public void paint() {
        System.out.println("Shape is painted red");
    }
}
