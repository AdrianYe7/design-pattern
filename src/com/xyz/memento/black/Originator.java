package com.xyz.memento.black;

public class Originator {
    private String state;
    
    public void setState(String state) {
        this.state = state;
        System.out.println("发起者的状态为：" + state);
    }
    
    public String getState() {
        return state;
    }
    
    public MementoIF createMemento() {
        return new Memento(state);
    }
    
    public void restoreMemento(MementoIF memento) {
        String oldState = ((Memento)memento).getState();
        setState(oldState);
    }
    
    private class Memento implements MementoIF {
        private String state;
        
        Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }
}
