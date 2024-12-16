package com.aleksey.behavioral.interpreter;

public class LowerString implements Expression {

    @Override
    public String interpret(String string) {
        return string.toLowerCase();
    }
}
