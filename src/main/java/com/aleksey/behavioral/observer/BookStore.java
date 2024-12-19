package com.aleksey.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Observer {
    private List<String> books = new ArrayList<>();
    private List<Subscriber> clients = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        notifySubs();
    }

    @Override
    public void addSubs(Subscriber subscriber) {
        clients.add(subscriber);
    }

    @Override
    public void removeSubs(Subscriber subscriber) {
        clients.remove(subscriber);
    }

    @Override
    public void notifySubs() {
        for (Subscriber sub: clients) sub.update(this.books.getLast());
    }
}
