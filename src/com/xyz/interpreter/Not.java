package com.xyz.interpreter;

/**
 * 非终结表达式角色
 * <p>Title: Not</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Not extends Expression {
    private Expression exp;
    
    Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Not) {
            return exp.equals(((Not)obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(Not " + exp.toString() + ")";
    }

}
