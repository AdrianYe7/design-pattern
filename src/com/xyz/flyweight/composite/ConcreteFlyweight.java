package com.xyz.flyweight.composite;

/**
 * 
 * <p>Title: ConcreteFlyweight</p>
 * <p>Description: 单纯享元对象</p>
 * @author AdrianYe
 *
 */
public class ConcreteFlyweight implements Flyweight {
    private String internalState;
    
    ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }
    
    @Override
    public void operation() {
        System.out.println("Internal State : " + internalState);
    }
}
