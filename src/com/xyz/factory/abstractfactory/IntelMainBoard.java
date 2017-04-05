package com.xyz.factory.abstractfactory;

public class IntelMainBoard implements MainBoard {
    private int cpuHoles = 0;
    
    IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
    
    @Override
    public void installCpu() {
        System.out.println("Intel主板的cpu插槽孔数为：" + cpuHoles);
    }

}
