package com.aleksey.behavioral.iterator;

public class ThroughArray implements IterableCollection {
    public int[] arr;

    public ThroughArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator createIterator() {
        return new ThroughOneIterator(this);
    }
}
