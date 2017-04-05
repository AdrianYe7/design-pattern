package com.xyz.factory.simplefactory;

public class ConcreteLoginB implements Login {

    @Override
    public boolean verify(String user, String password) {
        //...
        System.out.println("Login B is verify...");
        System.out.println("user : " + user + " password : " + password);
        return true;
    }

}
