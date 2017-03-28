package com.xyz.immutable.weak;

public class Client {
    public static void main(String[] args) {
        WeakOne wo = new WeakOneSon("zhangsan", 20);
        System.out.println(wo.getName() + " : " + wo.getAge());
    }
}
