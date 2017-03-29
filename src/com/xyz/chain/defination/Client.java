package com.xyz.chain.defination;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setHanlder(h2);
        h1.handleRequest();
    }
}
