package com.aleksey.behavioral.chain_of_responsibility;

public class Authorization extends BaseHandler {


    @Override
    public void handle(String id, String pass) {
        switch (id) {
            case "user":
                System.out.println("Set user roles");
                break;
            case "admin":
                System.out.println("Set admin roles");
                break;
        }
    }
}
