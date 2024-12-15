package com.aleksey.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void viewShape() {
        System.out.println("Circle creating");
        color.paint();
    }
}
