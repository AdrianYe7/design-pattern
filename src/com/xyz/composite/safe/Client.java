package com.xyz.composite.safe;

/**
 * 
 * <p>Title: Client</p>
 * <p>Description: 安全式的组合模式，要求管理聚集的方法只在树枝节点中</p>
 * @author Administrator
 *
 */
public class Client {
    public static void main(String[] args) {
        Composite c = new Composite("F");
        Composite composite1 = new Composite("F1");
        Leaf l1 = new Leaf("S1");
        Leaf l2 = new Leaf("S2");
        composite1.addChild(l1);
        composite1.addChild(l2);
        
        Composite composite2 = new Composite("F2");
        composite2.addChild(l1);
        composite2.addChild(l2);
        
        Composite composite3 = new Composite("F3");
        
        c.addChild(composite1);
        c.addChild(composite2);
        c.addChild(composite3);
        
        c.printStruct();
        
    }
}
