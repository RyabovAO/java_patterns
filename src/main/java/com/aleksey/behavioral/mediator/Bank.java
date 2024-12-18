package com.aleksey.behavioral.mediator;

public class Bank implements Mediator {
    public User sender;
    public User recipient;

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public void remittance(User user, int money) {
        System.out.println(sender.getName() + " отправил Клиенту " + user.getName() + " перевод: " + money + "р.");
    }
}
