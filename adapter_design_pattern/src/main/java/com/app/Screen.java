package com.app;

public class Screen implements Vga{

    @Override
    public void print(String msg){
        System.out.println("***************** Screen *****************");
        System.out.println(msg);
        System.out.println("*******************************************");
    }
}
