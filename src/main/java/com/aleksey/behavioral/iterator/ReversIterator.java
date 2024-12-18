package com.aleksey.behavioral.iterator;

public class ReversIterator implements Iterator {
    private ReverseArray reverseArray;
    private int index;

    public ReversIterator(ReverseArray reverseArray) {
        this.reverseArray = reverseArray;
        this.index = reverseArray.arr.length - 1;
    }

    @Override
    public boolean haveNext() {
        if(index >= 0){
            return true;
        } return false;
    }

    @Override
    public Object next() {
        return reverseArray.arr[index--];
    }
}
