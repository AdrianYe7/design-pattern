package com.xyz.chain.app;

public class GeneralManager extends Handler {

    @Override
    public void handleRequest(String applicant, double fee) {
        System.out.println("申请通过， 批准人：" + this.getClass().getName());
    }

}
