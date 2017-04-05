package com.xyz.factory.abstractfactory;

public class IntelCpu implements Cpu {
    /**
     * cpu的针脚数
     */
    private int pins = 0;
    
    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel Cpu的针脚数 : " + pins);
    }

}
