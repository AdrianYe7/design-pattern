package com.xyz.iterator.out;

public class Client {
    public static void main(String[] args) {
        operation();
    }
    
    public static void operation() {
        Aggregate agg = new ConcreteAggregate();
        Iterator iterator = agg.createIterator();
        while(!iterator.isDone()) {
            Object object = iterator.currentItem();
            iterator.next();
            System.out.println(object);
        }
    }
}
