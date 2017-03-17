package com.xyz.bridge.eg02.bridge;

public class UrgencyMessage extends AbstractMessage {

    UrgencyMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "�Ӽ��� " + message;
        super.sendMessage(message, toUser);
    }

    public void watch(String messageId) {
        System.out.println(messageId);
    }
}
