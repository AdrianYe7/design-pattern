package com.xyz.command.app;

public class KeyPad {
    private Command play = null;
    private Command rewind = null;
    private Command stop = null;
    
    KeyPad() {
    }
    
    public void setPlay(Command play) {
        this.play = play;
    }
    
    public void setRewind(Command rewind) {
        this.rewind = rewind;
    }
    
    public void setStop(Command stop) {
        this.stop = stop;
    }
    
    public void play() {
        play.execute();
    }
    
    public void rewind() {
        rewind.execute();
    }
    
    public void stop() {
        stop.execute();
    }
}
