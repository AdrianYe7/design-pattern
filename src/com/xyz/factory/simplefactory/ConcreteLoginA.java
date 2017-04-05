package com.xyz.factory.simplefactory;

public class ConcreteLoginA implements Login {

    @Override
    public boolean verify(String user, String password) {
        //....
        System.out.println("Login A is verifying");
        System.out.println("user : " + user + " password : " + password);
        return true;
    }

}
