package com.xyz.flyweight.single;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
    
    FlyweightFactory(){}
    
    public Flyweight getFlyweight(String name) {
        Flyweight fw = pool.get(name);
        if(fw == null) {
            fw = new ConcreteFlyweight(name);//ͨ�����������ȷ֪����Ԫģʽ�����ĳһ��ʵ����Ķ��������ĳһ���ӿڵ�����ʵ���࣬�ٸ���map����Ψһ�Կ���֪������һ��ʵ�����Ҫ��һ��������.
            pool.put(name, fw);
        }
        return fw;
    }
}
