package com.xyz.visitor.defination;

public class NodeB implements Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public String operationB() {
        return "NodeB";
    }

}
