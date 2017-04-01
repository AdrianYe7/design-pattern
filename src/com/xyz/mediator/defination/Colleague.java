package com.xyz.mediator.defination;

/**
 * 抽象同事类角色
 * <p>Title: Colleague</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Colleague {
    private Mediator mediator;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public Mediator getMediator() {
        return mediator;
    }
}
