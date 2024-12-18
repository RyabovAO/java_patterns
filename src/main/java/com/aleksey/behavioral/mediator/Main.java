package com.aleksey.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        User sender = new Sender(bank, "Jon");
        User recipient = new Recipient(bank, "Homer");

        bank.setSender(sender);
        bank.setRecipient(recipient);

        sender.sendMoney(recipient, 20);
        recipient.getMoney();
    }
}
