package com.xyz.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list = new ArrayList<Component>();
    private String name;
    
    Composite(String name) {
        this.name = name;
    }
    
    public void addChild(Component component) {
        list.add(component);
    }
    
    public void removeChild(Component component) {
        list.remove(component);
    }
    
    public List<Component> getChild() {
        return list;
    }
    
    @Override
    public void printStruct() {
        System.out.println("+" + name);
        for(Component component : list) {
            component.printStruct();
        }
    }
}
