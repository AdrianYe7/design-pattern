package com.xyz.templatemethod.defination;

/**
 * 模板方法模式：准备一个抽象类，将部分逻辑以具体方法以及具体的构造函数的形式实现，然后声明一些抽象方法，
 * 迫使子类实现剩余的逻辑。不同的子类以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。
 * <p>Title: AbstractTemplate</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法：代表的行为成为顶级行为，其逻辑也称为顶级逻辑
     * 看的教学这个方法是没有final的，但是个人觉得应该加上final
     * 
     * 因为模板方法的关键是子类可以置换掉父类的可变部分，但是不能改变模板方法所代表的顶级逻辑
     * 所以模板方法我认为应该是final的，防止子类对顶级逻辑进行修改
     */
    public final void templateMethod() {
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    
    /**
     * 基本方法（由子类实现）--->抽象方法，子类必须实现
     */
    protected abstract void abstractMethod();
    
    /**
     * 基本方法（空方法）--->钩子方法，有默认实现，子类可以选择扩展
     * 该种方法的命名一半是do开头，比如doGet,doPost
     */
    protected void hookMethod(){}
    
    /**
     * 基本方法（具体已经实现）
     */
    private final void concreteMethod(){
        //相关代码
    }
}
