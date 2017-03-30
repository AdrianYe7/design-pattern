package com.xyz.memento.self;

public class Originator {
    private String state;
    
    public void changeState(String state) {
        this.state = state;
    }
    
    public Memento createMemento() {
        return new Memento(this);
    }
    
    public String getState() {
        return this.state;
    }
    
    public void restoreMemento(MementoIF memento) {
        String s = ((Memento)memento).getState();
        changeState(s);
    }
    
    private class Memento implements MementoIF {
        private String state;

        private Memento(Originator originator) {
            this.state = originator.getState();
        }
        
        private String getState() {
            return this.state;
        }
    }
}
