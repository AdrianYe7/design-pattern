package com.xyz.interpreter;

/**
 * 非终结表达式角色
 * <p>Title: And</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class And extends Expression {
    private Expression left, right;
    
    And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof And) {
            return left.equals(((And)obj).left) && right.equals(((And)obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }

}
