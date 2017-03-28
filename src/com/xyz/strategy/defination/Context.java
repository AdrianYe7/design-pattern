package com.xyz.strategy.defination;

/**
 * 上下文角色(业务类，使用到策略类的类)
 * <p>Title: Context</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }
    
    public void go() {
        strategy.strategyInterface();
    }
}
