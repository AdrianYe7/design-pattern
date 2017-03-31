package com.xyz.visitor.test;

public class SubEast1 implements East {

    @Override
    public void goEast(West west) {
        west.goWest(this);
    }

    public String myName1() {
        return "SubEast1";
    }
}
