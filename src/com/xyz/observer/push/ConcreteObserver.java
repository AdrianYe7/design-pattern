package com.xyz.observer.push;

public class ConcreteObserver implements Observer {
    private String observerState;
    @Override
    public void update(String newState) {
        this.observerState = newState;
        System.out.println("观察者角色的状态改变为：" + observerState);
    }

}
