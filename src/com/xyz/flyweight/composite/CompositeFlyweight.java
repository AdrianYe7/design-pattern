package com.xyz.flyweight.composite;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompositeFlyweight implements Flyweight {
    private Map<String, Flyweight> parts = new HashMap<String, Flyweight>();

    CompositeFlyweight() {};
    
    public void addPart(String key, Flyweight flyweight) {
        parts.put(key, flyweight);
    }
    
    @Override
    public void operation() {
        Set<Entry<String,Flyweight>> set = parts.entrySet();
        for(Entry<String, Flyweight> ent : set) {
            ent.getValue().operation();
            
        }
    }

}
