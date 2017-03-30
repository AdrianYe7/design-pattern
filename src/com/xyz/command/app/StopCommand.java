package com.xyz.command.app;

public class StopCommand implements Command{
    private AudioPlayer player;
    
    
    public StopCommand(AudioPlayer player) {
        this.player = player;
    }



    @Override
    public void execute() {
        player.stop();
    }

}
