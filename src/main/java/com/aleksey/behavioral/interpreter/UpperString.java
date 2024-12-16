package com.aleksey.behavioral.interpreter;

public class UpperString implements Expression {

    @Override
    public String interpret(String string) {
        return string.toUpperCase();
    }
}
