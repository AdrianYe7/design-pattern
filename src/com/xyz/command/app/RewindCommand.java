package com.xyz.command.app;

public class RewindCommand implements Command {
    private AudioPlayer player;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }

}
