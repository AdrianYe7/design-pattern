package com.xyz.command.macro;

public class StopCommand implements Command {
    private AudioPlayer player;

    StopCommand(AudioPlayer player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        player.stop();
    }
    
    
}
