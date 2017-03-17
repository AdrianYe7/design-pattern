package com.xyz.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComponent implements Component {
    private List<Component> list = new ArrayList<Component>();
    
    protected String name;
    
    AbstractComponent(String name) {
        this.name = name;
    }
    
    @Override
    public abstract void printStruct();

    @Override
    public List<Component> getChild() {
        return list;
    }

    @Override
    public void addChild(Component component) {
        list.add(component);
    }

    @Override
    public void removeChild(Component component) {
        list.remove(component);
    }
    
}
