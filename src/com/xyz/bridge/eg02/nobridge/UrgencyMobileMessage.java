package com.xyz.bridge.eg02.nobridge;

public class UrgencyMobileMessage implements UrgencyMessage {

    @Override
    public void send(String message, String toUser) {
        message = "加急 : " + message;
        System.out.println("send a urgency message '" + message + "' with mobile to " + toUser);
    }

    @Override
    public Object watch(String messageId) {
        System.out.println("查到id为：" + messageId + "的mobile消息，处理流程状态为：已发送");
        return null;
    }

}
