package com.xyz.iterator.out;

/**
 * 具体聚集角色：实现创建迭代子对象的接口，返回一个合适的具体迭代子实例
 * 并给出访问内部聚集元素的接口
 * <p>Title: ConcreteAggregate</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArr = null;
    
    public ConcreteAggregate() {
        this.objArr = new Object[]{1, 2, 3, 4, 5, 6, 7};
    }
    
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    //getElement和size两个方法是宽接口，是提供给迭代子用的
    public Object getElement(int index) {
        if(index < objArr.length) {
            return objArr[index];
        }
        return null;
    }
    
    public int size() {
        return objArr.length;
    }

}
