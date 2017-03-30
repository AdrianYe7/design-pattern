package com.xyz.memento.black;

public class Caretaker {
    private MementoIF memento;
    
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
    
    public MementoIF retrieveMemento() {
        return memento;
    }
}
