package com.aleksey.behavioral.observer;

public interface Observer {
    void addSubs(Subscriber subscriber);
    void removeSubs(Subscriber subscriber);
    void notifySubs();
}
