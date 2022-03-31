package com.designpattern.template;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 13:21
 * @Description: com.designpattern.template
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        TemplateClass tpc = new ConcreteClass1();
        tpc.execute();
    }
}
