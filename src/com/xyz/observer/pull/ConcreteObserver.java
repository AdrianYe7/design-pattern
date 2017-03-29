package com.xyz.observer.pull;

public class ConcreteObserver implements Observer {
    private String observerState;
    
    @Override
    public void update(Subject subject) {
        observerState = subject.getState();
        System.out.println("观察者状态修改后为：" + observerState);
    }

}
