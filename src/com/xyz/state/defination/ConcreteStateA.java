package com.xyz.state.defination;

public class ConcreteStateA implements State {

    @Override
    public void handle(String handledState) {
        System.out.println("ConcreteStateA handle " + handledState);
    }

}
