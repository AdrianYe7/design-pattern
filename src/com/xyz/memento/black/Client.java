package com.xyz.memento.black;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        
        o.setState("zhangsan");
        MementoIF mi = o.createMemento();
        c.saveMemento(mi);
        
        o.setState("wangwu");
        
        MementoIF mi2 = c.retrieveMemento();
        o.restoreMemento(mi2);
    }
}
