package com.aleksey.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray(new int[]{3,1,4,5,6,7,8,9});
        ThroughArray throughArray = new ThroughArray(new int[]{3,1,4,5,6,7,8,9});

        Iterator reversIter = reverseArray.createIterator();
        Iterator throughIter = throughArray.createIterator();

        while (reversIter.haveNext()) System.out.print(reversIter.next());
        System.out.println("\n");
        while (throughIter.haveNext()) System.out.print(throughIter.next());
    }
}
