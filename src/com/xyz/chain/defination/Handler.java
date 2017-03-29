package com.xyz.chain.defination;

/**
 * 抽象处理者角色
 * <p>Title: Handler</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Handler {
    /**
     * 持有后继的处理者
     */
    protected Handler handler;
    
    /**
     * 处理请求
     */
    public abstract void handleRequest();
    
    public Handler getHandler() {
        return handler;
    }
    
    public void setHanlder(Handler handler) {
        this.handler = handler;
    }
}
