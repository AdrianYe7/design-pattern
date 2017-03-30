package com.xyz.command.macro;

public interface MacroCommand extends Command {

    public void addCommand(Command command);
    
    public void removeCommand(Command command);
}
