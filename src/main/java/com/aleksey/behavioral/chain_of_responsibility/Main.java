package com.aleksey.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler identification = new Identification();
        Handler authentication = new Authentication();
        Handler authorization = new Authorization();

        identification.setNext(authentication);
        authentication.setNext(authorization);

        identification.handle("user", "true");
    }
}
