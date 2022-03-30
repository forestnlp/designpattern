package com.designpattern.decorator;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 17:16
 * @Description: com.designpattern.decorator
 * @version: 1.0
 */
public class ConcretePrinter extends Printer{
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
