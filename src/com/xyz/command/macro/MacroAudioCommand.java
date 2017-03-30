package com.xyz.command.macro;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {
    private List<Command> commands;
    
    MacroAudioCommand() {
        commands = new ArrayList<Command>();
    }
    
    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void removeCommand(Command command) {
        commands.remove(command);
    }

}
