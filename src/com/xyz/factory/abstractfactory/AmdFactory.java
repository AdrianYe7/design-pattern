package com.xyz.factory.abstractfactory;

public class AmdFactory implements AbstractFactory {
    private int amdCpuHoles = 938;
    
    @Override
    public Cpu createCpu() {
        return new AmdCpu(amdCpuHoles);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(amdCpuHoles);
    }

}
