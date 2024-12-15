package com.aleksey.behavioral.chain_of_responsibility;

public class Authentication extends BaseHandler {


    @Override
    public void handle(String id, String pass) {
        if(pass.equals("true")) {
            System.out.println("Authentication completed");
            nextHandler.handle(id, pass);
        } else {
            System.out.println("Password is not correct");
        }
    }
}
