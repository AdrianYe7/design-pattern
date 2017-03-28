package com.xyz.immutable.strong;

/**
 * 该类不可能被修改
 * <p>Title: StrongTwo</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public final class StrongTwo {
    private final String name;
    private final int age;
    private final OutObject out;
    
    StrongTwo(String name, int age, OutObject out) {
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
