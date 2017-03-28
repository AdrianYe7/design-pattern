package com.xyz.immutable.strong;

public class Client {
    public static void main(String[] args) {
        StrongOne so = new StrongSon("zhangsan", 20);
        System.out.println(so.getName() + " : " + so.getAge());
    }
}
