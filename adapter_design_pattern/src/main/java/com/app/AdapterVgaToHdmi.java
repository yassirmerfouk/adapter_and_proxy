package com.app;

public class AdapterVgaToHdmi implements Vga{

    private Hdmi hdmi;

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String msg) {
        byte[] data = msg.getBytes();
        hdmi.plot(data);
    }
}
