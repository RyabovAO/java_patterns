package com.aleksey.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression lower = new LowerString();
        Expression upper = new UpperString();

        String s = "StriinG";

        String low = lower.interpret(s);
        String up = upper.interpret(s);

        System.out.println(low);
        System.out.println(up);
    }
}
