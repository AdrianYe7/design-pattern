package com.xyz.command.defination;

public class ConcreteCommand implements Command {
    private Receiver receiver = null;
    
    ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
