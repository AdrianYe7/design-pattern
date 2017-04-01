package com.xyz.mediator.defination;

/**
 * 具体同时类角色
 * <p>Title: ConcreteColleagueB</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    
    public void operationB() {
        getMediator().changed(this);
    }

}
