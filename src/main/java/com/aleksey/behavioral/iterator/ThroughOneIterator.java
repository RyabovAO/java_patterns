package com.aleksey.behavioral.iterator;

public class ThroughOneIterator implements Iterator {
    private ThroughArray throughArray;
    private int index;

    public ThroughOneIterator(ThroughArray throughArray) {
        this.throughArray = throughArray;
    }

    @Override
    public boolean haveNext() {
        if(index < throughArray.arr.length){
            return true;
        } return false;
    }

    @Override
    public Object next() {
        index += 1;
        return throughArray.arr[index++];
    }
}
