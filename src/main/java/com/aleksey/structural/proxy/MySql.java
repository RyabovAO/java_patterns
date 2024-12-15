package com.aleksey.structural.proxy;

public class MySql implements DataBase {

    @Override
    public void connect() {
        System.out.println("Connect to MySQL");
    }
}
