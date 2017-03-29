package com.xyz.iterator.in;

public interface Iterator<T> {
    public void first();
    
    public void next();
    
    public T currentItem();
    
    public boolean isDone(); 
}
