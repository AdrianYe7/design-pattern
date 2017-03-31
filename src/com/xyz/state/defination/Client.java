package com.xyz.state.defination;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State sa = new ConcreteStateA();
        context.setState(sa);
        context.request("zhangsan");
        
        State sb = new ConcreteStateB();
        context.setState(sb);
        context.request("lisi");
    }
}
