package com.xyz.visitor.test;

public class Client {
    public static void main(String[] args) {
        West west = new SubWest1();
        East east = new SubEast1();
        east.goEast(west);
        
        east = new SubEast2();
        east.goEast(west);
    }
}
