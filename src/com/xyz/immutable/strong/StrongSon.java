package com.xyz.immutable.strong;

public class StrongSon extends StrongOne {
    //get方法因为父类是final所以不可以重写
//    public String getName() {
//        return name;
//    }
//    
//    public int getAge() {
//        return age;
//    }

    public StrongSon(String name, int age) {
        super(name, age);
    }
}
