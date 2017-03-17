package com.xyz.bridge.eg02.bridge;

public class SpecialUrgencyMessage extends AbstractMessage {

    SpecialUrgencyMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
    
    public void hurry(String message) {
        
    }
}
