package com.xyz.visitor.test;

public class SubEast2 implements East {

    @Override
    public void goEast(West west) {
        west.goWest(this);
    }

    public String myName2() {
        return "SubEast2";
    }
}
