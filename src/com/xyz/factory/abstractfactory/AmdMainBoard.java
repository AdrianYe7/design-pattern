package com.xyz.factory.abstractfactory;

public class AmdMainBoard implements MainBoard {
    private int cpuHoles = 0;
    AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
    
    @Override
    public void installCpu() {
        System.out.println("Amd 主板的cpu插槽孔数为：" + cpuHoles);
    }

}
