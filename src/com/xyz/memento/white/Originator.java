package com.xyz.memento.white;

public class Originator {
    private String state;
    
    public Memento createMemento() {
        return new Memento(state);
    }
    
    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
        System.out.println("发起人的状态为：" + state);
    }
}
