package com.xyz.interpreter;

/**
 * 表示一个boolean常量.也相当于终结表达式角色
 * <p>Title: Constant</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Constant extends Expression {
    private boolean value;
    
    Constant(boolean value) {
        this.value = value;
    }
    
    @Override
    public boolean interpret(Context ctx) {

        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Constant) {
            return this.value = ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}
