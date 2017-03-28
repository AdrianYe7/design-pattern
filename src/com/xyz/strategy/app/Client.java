package com.xyz.strategy.app;

public class Client {
    public static void main(String[] args) {
        MemberStrategy strategy = new IntermediateMemberStrategy();
        Price price = new Price(strategy);
        double totalPrice = price.calcPrice(10, 15);
        System.out.println(totalPrice);
    }
}
