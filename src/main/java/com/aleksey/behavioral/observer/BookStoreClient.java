package com.aleksey.behavioral.observer;

public class BookStoreClient implements Subscriber {
        private String name;

    public BookStoreClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String book) {
        System.out.println("Уважаемый " + this.name + ", В магазине новая книга " + book);
    }
}
