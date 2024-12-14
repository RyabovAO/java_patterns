package com.aleksey.decorator;

public class Telegram implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Send message to Telegram");
    }
}
