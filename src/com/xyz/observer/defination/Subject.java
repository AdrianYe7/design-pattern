package com.xyz.observer.defination;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色（抽象被观察者角色）
 * <p>Title: Subject</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Attached an observer");
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Detached an observer");
    }
    
    public void notifyObservers(String newState) {
        for(Observer observer : observers) {
            observer.update(newState);
        }
    }
}
