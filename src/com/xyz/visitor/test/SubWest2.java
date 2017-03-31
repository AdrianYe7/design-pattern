package com.xyz.visitor.test;

public class SubWest2 implements West {

    @Override
    public void goWest(SubEast1 east) {
        System.out.println("SubWest2 " + east.myName1());
    }

    @Override
    public void goWest(SubEast2 east) {
        System.out.println("SubWest2 " + east.myName2());
    }

}
