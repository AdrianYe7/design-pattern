package com.xyz.mediator.defination;

/**
 * 具体调停者角色
 * <p>Title: ConcreteMediator</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    
    private ConcreteColleagueB colleagueB;
    
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }
    
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        //colleague改变的时候，对有写作的类进行操作
    }
}
