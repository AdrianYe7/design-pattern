package com.xyz.state.defination;

public class ConcreteStateB implements State {

    @Override
    public void handle(String handledState) {
        System.out.println("ConcreteStateB handle " + handledState);
    }

}
