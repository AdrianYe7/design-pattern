package com.xyz.composite.transparent;

public class Composite extends AbstractComponent {

    Composite(String name) {
        super(name);
    }

    @Override
    public void printStruct() {
        System.out.println("+" + this.name);
        for(Component component : this.getChild()) {
            component.printStruct();
        }
    }

}
