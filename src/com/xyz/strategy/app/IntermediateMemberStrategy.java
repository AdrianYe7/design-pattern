package com.xyz.strategy.app;

public class IntermediateMemberStrategy implements MemberStrategy {

    private static final double DISCOUNT = 0.9;
    
    @Override
    public double calcPrice(int number, double unitPrice) {
        return number*unitPrice*DISCOUNT;
    }

}
