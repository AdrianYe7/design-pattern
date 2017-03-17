package com.xyz.bridge.eg02.bridge;

public class EmailMessageSender implements MessageSender {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send a message '" + message + " with email to " + toUser);
    }

}
