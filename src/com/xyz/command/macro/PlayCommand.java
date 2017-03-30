package com.xyz.command.macro;

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
