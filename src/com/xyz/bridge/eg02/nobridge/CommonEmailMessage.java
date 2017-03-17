package com.xyz.bridge.eg02.nobridge;

public class CommonEmailMessage implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send a message : '" + message + "' with email to " + toUser);
    }

}
