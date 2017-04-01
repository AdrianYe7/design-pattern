package com.xyz.mediator.app;

public class MainBoard implements Mediator {
    private CDDriver cdDriver;
    private CPU cpu;
    private VideoCard videoCard;
    private SoundCard soundCard;
    
    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }
    
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
    
    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if(colleague instanceof CDDriver) {
            this.opeCDDriverReadData((CDDriver)colleague);
        } else if(colleague instanceof CPU) {
            this.opeCPU((CPU)colleague);
        }
    }

    private void opeCPU(CPU c) {
        String videoData = c.getVideoData();
        String soundData = c.getSoundData();
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }

    private void opeCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        cpu.executeData(data);
    }

}
