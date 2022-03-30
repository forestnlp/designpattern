package com.designpattern.prototype;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 11:26
 * @Description: com.designpattern.prototype
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComplexObject o = new ComplexObject(2,"Newton",new int[]{1,2,3,4});
        ComplexObject o1 = o.clone();
        o1.getArr()[2]=5;
        o1.setName("牛顿");
        System.out.println(o);
        System.out.println(o1);
    }
}
