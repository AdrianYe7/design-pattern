package com.xyz.bridge.eg02.nobridge;

public class SpecialUrgencyEmailMessage implements SpecialUrgencyMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println("send a special urgency message '" + message + "' with email to " + toUser);
    }

    @Override
    public void hurry(String messageId) {
      //query message by id and get the state
        //if state == 没收到  , send
        //if state == 收到 return
    }

}
