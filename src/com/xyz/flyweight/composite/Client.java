package com.xyz.flyweight.composite;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        
        Flyweight cf1 = factory.getCompositeFlyweight("mike", "jack", "july");
        Flyweight cf2 = factory.getCompositeFlyweight("mike", "jack", "july");
        System.out.println(cf1 == cf2);//复合享元对象是不能够共享的
    }
}
