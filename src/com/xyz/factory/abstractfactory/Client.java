package com.xyz.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new IntelFactory();
        CpuEngineer engineer = new CpuEngineer();
        engineer.makeComputer(factory);
    }
}
