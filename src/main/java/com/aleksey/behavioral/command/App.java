package com.aleksey.behavioral.command;

public class App {
    private Command open;
    private Command edit;
    private Command close;

    public App(Command open, Command edit, Command close) {
        this.open = open;
        this.edit = edit;
        this.close = close;
    }

    public void clickOpenButton() {
        open.execute();
    }

    public void clickEditButton() {
        edit.execute();
    }

    public void clickCloseButton() {
        close.execute();
    }
}
