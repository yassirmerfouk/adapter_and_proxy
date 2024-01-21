package com.app;

public class Client {

    private Standard standard;

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public void process(){
        System.out.println("Client Process");
        standard.process();
    }
}
