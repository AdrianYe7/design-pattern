package com.xyz.chain.app;

public abstract class Handler {
    protected Handler handler;
    
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    
    public Handler getHandler() {
        return handler;
    }
    
    public abstract void handleRequest(String applicant, double fee);
}
