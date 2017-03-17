package com.xyz.bridge.eg02.bridge;

public class CommonMessage extends AbstractMessage {

    CommonMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }

}
