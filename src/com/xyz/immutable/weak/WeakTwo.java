package com.xyz.immutable.weak;

public class WeakTwo {
    private String name;
    private int age;
    private OutObject out;
    
    WeakTwo(String name, int age, OutObject out) {
        this.name = name;
        this.age = age;
        this.out = out.clone();
    }
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public OutObject getOutObject() {
        return out.clone();
    }
}
