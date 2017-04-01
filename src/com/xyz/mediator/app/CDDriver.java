package com.xyz.mediator.app;

public class CDDriver extends Colleague {
    private String data = "";

    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    
    public String getData() {
        return data;
    }
    
    public void readCD() {
        //cd驱动器从cd中读取到的信息，逗号前是视频，逗号后是音频
        this.data = "One Piece, 海贼王我当定了";
        //通知主板，自己的状态改变了
        getMediator().changed(this);
    }

}
