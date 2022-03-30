package com.designpattern.decorator;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 17:20
 * @Description: com.designpattern.decorator
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new ConcretePrinter();
        Decorator decorator = new ConcreateDecorator(printer);
        decorator.print("i love design pattern");
    }
}
