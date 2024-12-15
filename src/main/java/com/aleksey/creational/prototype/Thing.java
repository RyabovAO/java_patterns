package com.aleksey.creational.prototype;

public class Thing implements Prototype {
    private int length;
    private int width;
    private int height;
    private String color;

    public Thing(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Thing(Thing thing) {
        this.length = thing.length;
        this.width = thing.width;
        this.height = thing.height;
        this.color = thing.color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Object clone() {
        return new Thing(this);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
