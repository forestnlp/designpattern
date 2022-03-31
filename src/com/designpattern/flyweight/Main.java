package com.designpattern.flyweight;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 11:56
 * @Description: com.designpattern.flyweight
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox i = factory.getBox("I");
        AbstractBox o = factory.getBox("O");
        AbstractBox l = factory.getBox("L");
        i.display("red");
    }
}
