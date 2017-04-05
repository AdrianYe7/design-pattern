package com.xyz.factory.abstractfactory;

public class IntelFactory implements AbstractFactory {
    private int intelCpuPins = 755;

    @Override
    public Cpu createCpu() {
        return new IntelCpu(intelCpuPins);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(intelCpuPins);
    }

}
