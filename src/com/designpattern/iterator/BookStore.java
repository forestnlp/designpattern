package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 16:31
 * @Description: com.designpattern.iterator
 * @version: 1.0
 */
public class BookStore implements Collection{
    private List<String> books = new ArrayList<>();

    public BookStore() {
        this.books.add("超人");
        this.books.add("沉默");
        this.books.add("编译");
    }

    public Iterator getIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator{
        private int index = 0;

        @Override
        public String first() {
            return books.get(0);
        }

        @Override
        public String next() {
            if(hasNext())
                return books.get(index++);
            return null;
        }

        @Override
        public boolean hasNext() {
            return index<books.size();
        }
    }
}
