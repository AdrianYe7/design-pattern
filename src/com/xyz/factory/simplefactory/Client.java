package com.xyz.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        String type = "a";
        String user = "mike";
        String password = "mike2018";
        
        Login loginer = LoginManager.getLogin(type);
        boolean verify = loginer.verify(user, password);
    }
}
