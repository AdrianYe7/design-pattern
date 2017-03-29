package com.xyz.observer.pull;

public class ConcreteSubject extends Subject {

    @Override
    public void change(String newState) {
        this.notifyAllObservers(newState);
    }

}
