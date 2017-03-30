package com.xyz.memento.self;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.changeState("zhangsan");
        System.out.println(o.getState());
        
        MementoIF memento = o.createMemento();
        
        o.changeState("lisi");
        System.out.println(o.getState());
        
        o.restoreMemento(memento);
        System.out.println(o.getState());
        
    }
}
