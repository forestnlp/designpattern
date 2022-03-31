package com.designpattern.iterator;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 16:36
 * @Description: com.designpattern.iterator
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        Iterator iterator = store.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.first());
    }
}
