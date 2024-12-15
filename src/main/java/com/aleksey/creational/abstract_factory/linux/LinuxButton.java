package com.aleksey.creational.abstract_factory.linux;

import com.aleksey.creational.abstract_factory.Button;

public class LinuxButton implements Button {
    @Override
    public void display() {
        System.out.println("Linux button displayed");
    }
}
