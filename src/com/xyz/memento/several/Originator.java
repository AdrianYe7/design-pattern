package com.xyz.memento.several;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private List<String> states;
    private int index;
    
    Originator() {
        states = new ArrayList<>();
        index = 0;
    }
    
    public Memento createMemento() {
        return new Memento(states, index);
    }
    
    public void resotreMemento(Memento memento) {
        List<String> list = memento.getStates();
        int index2 = memento.getIndex();
        states = list;
        index = index2;
    }

    public void setState(String state) {
        states.add(state);
        index++;
    }
    
    public void printStates() {
        for(String state : states) {
            System.out.println("State : " + state);
        }
    }
}
