package com.xyz.bridge.eg02.nobridge;

public class UrgencyMobileMessage implements UrgencyMessage {

    @Override
    public void send(String message, String toUser) {
        message = "�Ӽ� : " + message;
        System.out.println("send a urgency message '" + message + "' with mobile to " + toUser);
    }

    @Override
    public Object watch(String messageId) {
        System.out.println("�鵽idΪ��" + messageId + "��mobile��Ϣ����������״̬Ϊ���ѷ���");
        return null;
    }

}
