package com.xyz.command.app;

public class PlayCommand implements Command {
    private AudioPlayer player;
    
    PlayCommand(AudioPlayer player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        player.play();
    }

}
