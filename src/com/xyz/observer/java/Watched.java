package com.xyz.observer.java;

import java.util.Observable;
/**
 * Observable是java提供的可被观察的类，被观察者通过继承它来实现通知功能
 * <p>Title: Watched</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Watched extends Observable{
    private String state;
    
    public String getState() {
        return state;
    }
    
    public void setState(String newState) {
        if(!newState.equals(state)) {
            this.state = newState;
            this.setChanged();
        }
        this.notifyObservers();
    }
}
