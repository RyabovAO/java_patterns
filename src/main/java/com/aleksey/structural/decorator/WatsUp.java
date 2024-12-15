package com.aleksey.structural.decorator;

public class WatsUp implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Send message to WatsUp");
    }
}
