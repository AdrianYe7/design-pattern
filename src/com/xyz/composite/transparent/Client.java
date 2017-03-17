package com.xyz.composite.transparent;

public class Client {
    public static void main(String[] args) {
        Component c = new Composite("F");
        Component c1 = new Composite("FS1");
        Component c2 = new Composite("FS2");
        
        Component l1 = new Leaf("S1");
        Component l2 = new Leaf("S2");
        Component l3 = new Leaf("S3");
        Component l4 = new Leaf("S4");
        
        c1.addChild(l1);
        c1.addChild(l2);
        c1.addChild(l3);
        c2.addChild(l4);
        
        c.addChild(c1);
        c.addChild(c2);
        
        c.printStruct();
        
    }
}
