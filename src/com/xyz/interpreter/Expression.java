package com.xyz.interpreter;

/**
 * 抽象表达式角色
 * <p>Title: Expression</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public abstract class Expression {
    /**
     * 负责解释给定的表达式
     * @param ctx
     * @return
     */
    public abstract boolean interpret(Context ctx);
    
    /**
     * 检测两个表达式在结构上是否相同
     */
    public abstract boolean equals(Object obj);
    
    /**
     * 返回表达式的hash code
     */
    public abstract int hashCode();
    
    /**
     * 将表达式转换成字符串
     */
    public abstract String toString();
}
