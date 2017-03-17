package com.xyz.composite.safe;

public class Leaf implements Component {
    
    private String name;
    
    Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct() {
        System.out.println("-" + name);
    }

}
