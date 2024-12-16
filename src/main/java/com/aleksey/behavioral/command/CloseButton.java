package com.aleksey.behavioral.command;

public class CloseButton extends BaseButton {

    @Override
    public void execute() {
        notepad.close();
    }

    public CloseButton(Notepad notepad) {
        super(notepad);
    }
}
