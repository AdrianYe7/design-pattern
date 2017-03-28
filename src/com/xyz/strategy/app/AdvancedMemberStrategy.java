package com.xyz.strategy.app;

public class AdvancedMemberStrategy implements MemberStrategy {
    private static final double DISCOUNT = 0.8;

    @Override
    public double calcPrice(int number, double unitPrice) {
        return number*unitPrice*DISCOUNT;
    }

}
