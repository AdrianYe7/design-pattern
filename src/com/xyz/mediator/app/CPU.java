package com.xyz.mediator.app;

public class CPU extends Colleague {

    private String videoDate = "";
    private String soundData = "";
    
    public CPU(Mediator mediator) {
        super(mediator);
    }
    
    public String getVideoData() {
        return videoDate;
    }
    
    public String getSoundData() {
        return soundData;
    }
    
    public void executeData(String data) {
        String[] dataArr = data.split(",");
        this.videoDate = dataArr[0];
        this.soundData = dataArr[1];
        getMediator().changed(this);
    }
}
