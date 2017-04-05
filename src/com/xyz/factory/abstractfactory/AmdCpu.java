package com.xyz.factory.abstractfactory;

public class AmdCpu implements Cpu {
    private int pins = 0;
    
    public AmdCpu(int pins) {
        this.pins = pins;
    }
    
    @Override
    public void calculate() {
        System.out.println("Amd Cpu的针脚数为:" + pins);
    }

}
