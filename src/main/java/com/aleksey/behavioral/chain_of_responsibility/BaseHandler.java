package com.aleksey.behavioral.chain_of_responsibility;

public abstract class BaseHandler implements Handler {
    protected Handler handler;
    protected Handler nextHandler;


    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
}
