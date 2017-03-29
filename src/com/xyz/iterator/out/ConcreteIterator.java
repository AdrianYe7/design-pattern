package com.xyz.iterator.out;

/**
 * 实现Iterator接口，并保存迭代过程中游标位置
 * 保存了具体聚集角色的引用，通过具体聚集角色提供的访问内部聚集元素的接口遍历聚集元素
 * <p>Title: ConcreteIterator</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteIterator implements Iterator{
    private ConcreteAggregate aggregate;
    
    private int index;
    
    private int size;
    
    ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < size)
            index++;
    }

    @Override
    public boolean isDone() {
        return (index >= size);
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }

}
