package com.aleksey.adapter;

public class AdapterXmlToJson implements XmlData {
    private Analytic analytic = new Analytic();

    @Override
    public void xmlToString() {
        analytic.JSonToString();
    }
}
