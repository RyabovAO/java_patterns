package com.aleksey.structural.decorator;

public class SMS implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Send message to SMS");
    }
}
