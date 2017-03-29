package com.xyz.iterator.out;

/**
 * 抽象迭代子角色：给出遍历聚集元素的接口
 * <p>Title: Iterator</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public interface Iterator {
    public void first();
    
    public void next();
    
    public boolean isDone();
    
    public Object currentItem();
}
