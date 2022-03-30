package com.designpattern.decorator;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 17:17
 * @Description: com.designpattern.decorator
 * @version: 1.0
 */
public abstract class Decorator extends Printer {
    private Printer printer;

    public Decorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        printer.print(str);
    }
}
