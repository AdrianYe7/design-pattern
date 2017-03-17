package com.xyz.bridge.eg02.bridge;

public class MobileMessageSender implements MessageSender {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send a message '" + message + "' with mobile to " + toUser);
    }

}
