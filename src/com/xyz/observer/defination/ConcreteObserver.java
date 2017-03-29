package com.xyz.observer.defination;

public class ConcreteObserver implements Observer {

    private String observerState;
    
    @Override
    public void update(String newState) {
        observerState = newState;
        System.out.println("观察者的状态变为：" + observerState);
    }

}
