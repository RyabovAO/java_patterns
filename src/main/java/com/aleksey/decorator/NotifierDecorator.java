package com.aleksey.decorator;

public class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage() {
        notifier.sendMessage();
        System.out.println("message sent");
    }
}
