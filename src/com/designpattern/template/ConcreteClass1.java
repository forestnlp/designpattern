package com.designpattern.template;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 13:20
 * @Description: com.designpattern.template
 * @version: 1.0
 */
public class ConcreteClass1 extends TemplateClass{
    @Override
    public void open() {
        System.out.println("打开冰箱门");
    }

    @Override
    public void put() {
        System.out.println("把大象放进去");
    }

    @Override
    public void close() {
        System.out.println("关上冰箱门");
    }
}
