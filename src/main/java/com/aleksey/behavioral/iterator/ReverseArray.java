package com.aleksey.behavioral.iterator;

public class ReverseArray implements IterableCollection {
    public int[] arr;


    public ReverseArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator createIterator() {
        return new ReversIterator(this);
    }
}
