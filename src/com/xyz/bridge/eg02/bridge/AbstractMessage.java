package com.xyz.bridge.eg02.bridge;

public abstract class AbstractMessage {
    
    protected MessageSender sender;
    AbstractMessage(MessageSender messageSender) {
        this.sender = messageSender;
    }
    
    public void sendMessage(String message, String toUser) {
        sender.send(message, toUser);
    }
}
