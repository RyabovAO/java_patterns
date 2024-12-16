package com.aleksey.behavioral.command;

public class OpenButton extends BaseButton {

    @Override
    public void execute() {
        notepad.open();
    }

    public OpenButton(Notepad notepad) {
        super(notepad);
    }
}
