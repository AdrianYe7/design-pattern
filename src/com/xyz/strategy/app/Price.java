package com.xyz.strategy.app;

public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        super();
        this.strategy = strategy;
    }
    
    public double calcPrice(int number, double unitPrice) {
        return strategy.calcPrice(number, unitPrice);
    }
}
