package com.xyz.templatemethod.app;

/**
 * 货币市场账号
 * <p>Title: MoneyMarketAmount</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Monkey Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }

}
