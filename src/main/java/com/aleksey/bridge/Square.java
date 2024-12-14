package com.aleksey.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void viewShape() {
        System.out.println("Square creating");
        color.paint();
    }
}
