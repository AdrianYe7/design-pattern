package com.xyz.strategy.app;

public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(int number, double unitPrice) {
        return number*unitPrice;
    }

}
