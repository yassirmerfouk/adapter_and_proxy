package com.app;

public class VideoProjector implements Vga{
    @Override
    public void print(String msg) {
        System.out.println("............... Projector ...............");
        System.out.println(msg);
        System.out.println("..........................................");
    }
}
