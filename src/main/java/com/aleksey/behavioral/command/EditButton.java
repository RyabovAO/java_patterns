package com.aleksey.behavioral.command;

public class EditButton extends BaseButton {

    @Override
    public void execute() {
        notepad.edit();
    }

    public EditButton(Notepad notepad) {
        super(notepad);
    }
}
