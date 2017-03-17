package com.xyz.composite.transparent;

import java.util.List;

public interface Component {
    public void printStruct();
    public List<Component> getChild();
    public void addChild(Component component);
    public void removeChild(Component component);
}
