package com.xyz.bridge.eg02.bridge;

public class Client {
    public static void main(String[] args) {
        MessageSender sender = new MobileMessageSender();
        AbstractMessage message = new UrgencyMessage(sender);
        message.sendMessage("请假", "经理");
        if(message instanceof UrgencyMessage) {
            UrgencyMessage m = (UrgencyMessage)message;
            m.watch("0001");
        }
    }
}
