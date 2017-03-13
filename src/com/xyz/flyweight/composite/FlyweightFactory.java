package com.xyz.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> pools = new HashMap<String, Flyweight>();
    
    FlyweightFactory() {
        
    }
    
    public Flyweight getCompositeFlyweight(String...states) {
        CompositeFlyweight cf = new CompositeFlyweight();
        for(String state : states) {
            cf.addPart(state, getSingleFlyweight(state));
        }
        return cf;
    }
    
    public Flyweight getSingleFlyweight(String state) {
        Flyweight flyweight = pools.get(state);
        
        if(flyweight == null) {
            flyweight = new ConcreteFlyweight(state);
            pools.put(state, flyweight);
        }
        
        return flyweight;
    }
}
