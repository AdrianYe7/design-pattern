package com.xyz.factory.abstractfactory;

public class CpuEngineer {
    private Cpu cpu = null;
    private MainBoard mainBoard = null;
    
    public void makeComputer(AbstractFactory factory) {
        prepareHardwares(factory);
    }

    private void prepareHardwares(AbstractFactory factory) {
        this.cpu = factory.createCpu();
        this.mainBoard = factory.createMainBoard();
        
        this.cpu.calculate();
        this.mainBoard.installCpu();
    }
}
