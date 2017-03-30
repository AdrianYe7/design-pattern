package com.xyz.memento.several;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        
        //---1----
        o.setState("zhangsan");
        o.createMemento();//可以省略，这里加上是因为Memento外置，防止memento被修改
        c.createMemento();
        
        //---2----
        o.setState("lisi");
        o.createMemento();
        c.createMemento();
        
        //---3----
        o.setState("wangwu");
        o.createMemento();
        c.createMemento();
        
        //---4----
        o.setState("zhaoliu");
        o.createMemento();
        c.createMemento();
        
        o.printStates();
        System.out.println("----------恢复检查点---------");
        c.restoreMemento(2);
        o.printStates();
    }
}
