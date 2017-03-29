package com.xyz.chain.app;

public class DeptManager extends Handler {

    @Override
    public void handleRequest(String applicant, double fee) {
        if(fee > 1000) {
            getHandler().handleRequest(applicant, fee);
        } else {
            System.out.println("申请通过，批准人：" + this.getClass().getName());
        }
    }

}
