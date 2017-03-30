package com.xyz.command.macro;

public class RewindCommand implements Command {
    private AudioPlayer player;
    
    RewindCommand(AudioPlayer player) {
        this.player = player;
    }
    
    
    @Override
    public void execute() {
        player.rewind();
    }

}
