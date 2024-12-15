package com.aleksey.behavioral.chain_of_responsibility;

public class Identification extends BaseHandler {


    @Override
    public void handle(String id, String pass) {
        if(id.equals("user") || id.equals("admin")) {
            System.out.println("client identification " + id);
            nextHandler.handle(id, pass);
        } else {
            System.out.println("Identification id is wrong");
        }
    }
}
