package com.xyz.bridge.eg02.nobridge;

public class UrgencyEmailMessage implements UrgencyMessage {

    @Override
    public void send(String message, String toUser) {
        message = "�Ӽ� : " + message;
        System.out.println("send a urgency message '" + message + "' with email to " + toUser);
    }

    @Override
    public Object watch(String messageId) {
        System.out.println("�鵽idΪ��" + messageId + "��email��Ϣ����������״̬Ϊ���ѷ���");
        return null;
    }

}
