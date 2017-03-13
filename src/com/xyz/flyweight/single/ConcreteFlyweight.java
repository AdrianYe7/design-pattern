package com.xyz.flyweight.single;

public class ConcreteFlyweight implements Flyweight {
    private String internalState;
    
    ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }
    
    @Override
    public void operation() {
        System.out.println("Internal State : " + this.internalState);
    }
}
