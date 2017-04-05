package com.xyz.factory.simplefactory;

/**
 * 工厂类
 * 优点：分担了客户端选择和创建对象的责任
 * 缺点：集中所有的判断逻辑，添加删除逻辑很麻烦，而且当这个类出现问题的时候，整个业务都会受到影响
 * <p>Title: LoginManager</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class LoginManager {
    public static Login getLogin(String type) {
        if(type.equals("a")) {
            return new ConcreteLoginA();
        } else if(type.equals("b")) {
            return new ConcreteLoginB();
        } else {
            throw new IllegalArgumentException("错误的登录类型选择!");
        }
    }
}
