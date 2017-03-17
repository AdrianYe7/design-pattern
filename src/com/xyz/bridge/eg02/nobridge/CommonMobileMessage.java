package com.xyz.bridge.eg02.nobridge;

public class CommonMobileMessage implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send a message ' " + message + "' with mobile to " + toUser);
    }

}
