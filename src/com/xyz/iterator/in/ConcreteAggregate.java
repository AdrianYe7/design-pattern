package com.xyz.iterator.in;

public class ConcreteAggregate extends Aggregate {
    private Object[] objArr;
    
    ConcreteAggregate() {
        objArr = new Object[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
    
    private class ConcreteIterator implements Iterator {
        private int index;
        private int size;

        ConcreteIterator() {
            index = 0;
            size = objArr.length;
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
        public Object currentItem() {
            return objArr[index];
        }

        @Override
        public boolean isDone() {
            return (index>=size);
        }
        
    }

}
