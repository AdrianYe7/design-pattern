package com.xyz.iterator.in;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        while( !iterator.isDone() ) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
