package com.xyz.state.defination;

public class Context {
    private State state;
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void request(String handledState) {
        state.handle(handledState);
    }
}
