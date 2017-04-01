package com.xyz.interpreter;

/**
 * 一个该对象代表一个有名变量。终结表达式角色
 * <p>Title: Variable</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Variable extends Expression {
    private String name;
    
    Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Variable) {
            return this.name.equals(((Variable)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

}
