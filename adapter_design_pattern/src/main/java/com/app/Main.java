package com.app;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setVga(new Screen());
        computer.display("Hello");
        computer.setVga(new VideoProjector());
        computer.display("Hello");

        AdapterVgaToHdmi adapterVgaToHdmi = new AdapterVgaToHdmi();
        adapterVgaToHdmi.setHdmi(new Tv());
        computer.setVga(adapterVgaToHdmi);
        computer.display("hello");
    }
}
