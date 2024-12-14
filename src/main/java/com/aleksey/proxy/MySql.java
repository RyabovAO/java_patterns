package com.aleksey.proxy;

public class MySql implements DataBase {

    @Override
    public void connect() {
        System.out.println("Connect to MySQL");
    }
}
