package com.xyz.visitor.defination;

public class NodeA implements Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public String operationA() {
        return "NodeA";
    }

}
