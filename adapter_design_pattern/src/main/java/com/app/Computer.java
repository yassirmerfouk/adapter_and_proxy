package com.app;

public class Computer {

    private Vga vga;

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public void display(String msg){
        System.out.println("*************** Computer ***************");
        vga.print(msg);
    }
}
