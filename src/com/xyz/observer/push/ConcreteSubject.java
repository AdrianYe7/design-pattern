package com.xyz.observer.push;

public class ConcreteSubject extends Subject {

    @Override
    public void change(String newState) {
        this.notifyAllObservers(newState);
    }

}
