package com.app;

import java.util.Random;

public class Proxy implements Standard{

    private Standard standard;
    @Override
    public void process() {
        boolean access = new Random().nextBoolean();
        if(access){
            standard = new StandardImp1();
            standard.process();
        }
        else
            throw new RuntimeException("Forbidden 403");
    }

}
