package com.app;

public class Tv implements Hdmi{

    @Override
    public void plot(byte[] data) {
        String msg = new String(data);
        System.out.println("***************** Tv *****************");
        System.out.println(msg);
        System.out.println("***************************************");
    }
}
