package com.xyz.flyweight.single;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fw1 = factory.getFlyweight("mike");
        fw1.operation();
        Flyweight fw2 = factory.getFlyweight("mike");
        fw2.operation();
        System.out.println(fw1 == fw2);//true
    }
}
