package com.xyz.command.macro;

public class KeyPad {
    private Command play;
    private Command rewind;
    private Command stop;
    
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
