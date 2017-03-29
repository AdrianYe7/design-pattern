package com.xyz.observer.pull;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private String state;
    
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public String getState() {
        return state;
    }
    
    protected void notifyAllObservers(String newState) {
        this.state = newState;
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
    
    public abstract void change(String newState);
}
