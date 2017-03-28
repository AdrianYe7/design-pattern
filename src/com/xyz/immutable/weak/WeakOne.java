package com.xyz.immutable.weak;

public class WeakOne {
    private String name;
    private int age;
    private OutObject out = new OutObject();//包含一个对外界可变对象的引用
    
    public WeakOne(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
//    对外界可变对象的访问进行限制,不可以直接返回
//    public OutObject getOut() {
//        return out;
//    }
    public OutObject getOut() {
        return out.clone();//返回可变对象的克隆对象
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
