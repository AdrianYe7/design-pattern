package com.xyz.memento.several;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator o;
    private List<Memento> mementos = new ArrayList<Memento>();
    private int current;
    
    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }
    
    public int createMemento() {
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }
    
    public void restoreMemento(int index) {
        Memento memento = mementos.get(index);
        o.resotreMemento(memento);
    }
    
    public void removeMemento(int index) {
        mementos.remove(index);
    }
}
