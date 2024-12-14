package com.aleksey.proxy;

public class ProxySQL implements DataBase {
    private MySql mySql;

    @Override
    public void connect() {
        if(mySql == null) {
            mySql = new MySql();
        }
        mySql.connect();
    }
}
