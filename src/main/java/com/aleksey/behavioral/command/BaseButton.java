package com.aleksey.behavioral.command;

public abstract class BaseButton implements Command {
    protected Notepad notepad;

    public BaseButton(Notepad notepad) {
        this.notepad = notepad;
    }
}
