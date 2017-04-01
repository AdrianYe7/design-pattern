package com.xyz.mediator.defination;

/**
 * 具体同事类角色
 * <p>Title: ConcreteColleagueA</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }
    
    public void operationA() {
        getMediator().changed(this);
    }
}
