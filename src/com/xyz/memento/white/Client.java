package com.xyz.memento.white;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        originator.setState("zhangsan");
        Memento memento = originator.createMemento();
        caretaker.saveMemento(memento);
        
        System.out.println(originator.getState());
        
        originator.setState("lisi");
        System.out.println(originator.getState());
        
        Memento m2 = caretaker.retrieveMemento();
        originator.restoreMemento(m2);
        System.out.println(originator.getState());
    }
}
