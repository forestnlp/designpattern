package com.designpattern.decorator;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 17:18
 * @Description: com.designpattern.decorator
 * @version: 1.0
 */
public class ConcreateDecorator extends Decorator {

    public ConcreateDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String str) {
        for (int i = 0; i < str.length(); i++)
            System.out.print('*');
        System.out.println();
        super.print(str);
        for (int i = 0; i < str.length(); i++)
            System.out.print('*');
        System.out.println();
    }
}
