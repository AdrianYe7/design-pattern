package com.xyz.templatemethod.app;

/**
 * 根据不同的账户计算不同的利息
 * <p>Title: Account</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Account {
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount*interestRate;
    }
    
    protected abstract String doCalculateAccountType();
    
    protected abstract double doCalculateInterestRate();
    
    private double calculateAmount(String accountType) {
        //业务逻辑
        return 72433.00;
    }
}
