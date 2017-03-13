package com.xyz.flyweight.single;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
    
    FlyweightFactory(){}
    
    public Flyweight getFlyweight(String name) {
        Flyweight fw = pool.get(name);
        if(fw == null) {
            fw = new ConcreteFlyweight(name);//通过这里，可以明确知道享元模式是针对某一个实现类的对象而不是某一个接口的所有实现类，再根据map键的唯一性可以知道：有一个实现类就要有一个工厂类.
            pool.put(name, fw);
        }
        return fw;
    }
}
