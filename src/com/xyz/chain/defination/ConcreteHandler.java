package com.xyz.chain.defination;

public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if(getHandler() != null) {
            System.out.println(this + " 放过请求，下一个处理者会处理。");
            getHandler().handleRequest();
        } else {
            System.out.println(this + " 处理该请求!");
        }
    }

}
