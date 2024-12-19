package com.aleksey.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Subscriber client1 = new BookStoreClient("Igor");
        Subscriber client2 = new BookStoreClient("Pasha");
        Subscriber client3 = new BookStoreClient("Sveta");

        bookStore.addBook("BookOne");
        bookStore.addBook("BookTwo");

        bookStore.addSubs(client1);
        bookStore.addSubs(client2);
        bookStore.addSubs(client3);

        bookStore.addBook("NewBook");
    }
}
