package com.xyz.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文角色，用来存取终结表达符对应的值。
 * <p>Title: Context</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();
    
    public void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }
    
    public boolean lookup(Variable var) throws IllegalArgumentException {
        Boolean value = map.get(var);
        if(value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
