package com.xyz.immutable.weak;

/**
 * 子类是可变的
 * <p>Title: WeakOneSon</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class WeakOneSon extends WeakOne {

    public WeakOneSon(String name, int age) {
        super(name, age);
    }

    @Override
    public OutObject getOut() {
        return new OutObject();
    }

    @Override
    public String getName() {
        return "zhang";
    }

    @Override
    public int getAge() {
        return 30;
    }
    
    

}
