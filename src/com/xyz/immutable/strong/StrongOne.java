package com.xyz.immutable.strong;

public class StrongOne {
    private String name;
    private int age;
    private OutObject out;
    
    public StrongOne(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public final String getName() {
        return name;
    }
    public final int getAge() {
        return age;
    }
    public final OutObject getOutObject() {
        return out.clone();
    }
}
