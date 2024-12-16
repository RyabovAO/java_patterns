package com.aleksey.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();

        Command openButton = new OpenButton(notepad);
        Command editButton = new EditButton(notepad);
        Command closeButton = new CloseButton(notepad);

        App app = new App(openButton, editButton, closeButton);

        app.clickOpenButton();
        app.clickEditButton();
        app.clickCloseButton();
    }
}
