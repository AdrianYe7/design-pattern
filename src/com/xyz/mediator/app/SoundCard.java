package com.xyz.mediator.app;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    
    public void soundData(String data) {
        System.out.println("声音：" + data);
    }
}
