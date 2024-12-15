package com.aleksey.creational.factory_method;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Linux button");
    }
}
