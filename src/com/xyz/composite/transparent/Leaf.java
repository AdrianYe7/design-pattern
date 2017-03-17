package com.xyz.composite.transparent;

public class Leaf extends AbstractComponent {

    Leaf(String name) {
        super(name);
    }

    @Override
    public void printStruct() {
        System.out.println("-" + this.name);
    }

}
