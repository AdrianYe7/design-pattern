package com.xyz.command.app;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        Command play = new PlayCommand(player);
        Command rewind = new RewindCommand(player);
        Command stop = new StopCommand(player);
        
        KeyPad kp = new KeyPad();
        kp.setPlay(play);
        kp.setRewind(rewind);
        kp.setStop(stop);
        
        kp.play();
        kp.rewind();
        kp.stop();
    }
}
