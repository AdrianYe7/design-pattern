package com.xyz.observer.push;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    
    private String state;
    
    public String getState() {
        return state;
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyAllObservers(String newState) {
        this.state = newState;
        for(Observer observer : observers) {
            observer.update(state);
        }
    }
    
    protected abstract void change(String newState);
}
