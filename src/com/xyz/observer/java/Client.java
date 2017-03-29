package com.xyz.observer.java;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        Watched watched = new Watched();
        Observer observer = new Watcher();
        watched.addObserver(observer);
        watched.setState("sdfdf");
    }
}
