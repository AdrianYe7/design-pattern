package com.xyz.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    /**
     * 其实我很不喜欢这里的强转的（所以push,pull包中，我都将状态集中到了抽象类中），
     * 不过当明白观察者模式的组成部分是publisher--subscriber,本身就是一对多的关系，也就释然了。
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((Watched)o).getState());
    }

}
