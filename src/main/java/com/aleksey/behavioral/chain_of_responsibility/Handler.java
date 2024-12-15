package com.aleksey.behavioral.chain_of_responsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(String name, String pass);
}
