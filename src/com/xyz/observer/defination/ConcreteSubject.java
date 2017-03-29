package com.xyz.observer.defination;

/**
 * 具体主题角色：具体主题内状态改变时，通知所有的观察者
 * <p>Title: ConcreteSubject</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteSubject extends Subject {
    private String state;
    
    public String getState() {
        return state;
    }
    
    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        this.notifyObservers(state);
    }
}
