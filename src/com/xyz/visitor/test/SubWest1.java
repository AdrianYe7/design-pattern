package com.xyz.visitor.test;

public class SubWest1 implements West {

    @Override
    public void goWest(SubEast1 east) {
        System.out.println("SubWest1 " + east.myName1());
    }

    @Override
    public void goWest(SubEast2 east) {
        System.out.println("SubWest1 " + east.myName2());
    }

}
