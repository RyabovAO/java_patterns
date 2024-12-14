package com.aleksey.singleton;

public class WebDriver {
    private static WebDriver webDriver;

    private WebDriver () {
        System.out.println("Driver create");
    }

    public static WebDriver getInstance() {
        if(webDriver == null) {
            webDriver = new WebDriver();
        }
        return webDriver;
    }
}
