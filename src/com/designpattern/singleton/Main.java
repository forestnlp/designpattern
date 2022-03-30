package com.designpattern.singleton;


import com.designpattern.singleton.hungry.Singleton;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 10:39
 * @Description: com.designpattern.singleton
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);

        com.designpattern.singleton.lazy.Singleton obj3 = com.designpattern.singleton.lazy.Singleton.getSingleton();
        com.designpattern.singleton.lazy.Singleton obj4 = com.designpattern.singleton.lazy.Singleton.getSingleton();
        System.out.println(obj3==obj4);

        com.designpattern.singleton.enums.Singleton obj5 = com.designpattern.singleton.enums.Singleton.getInstance();
        com.designpattern.singleton.enums.Singleton obj6 = com.designpattern.singleton.enums.Singleton.getInstance();
        System.out.println(obj5==obj6);

        com.designpattern.singleton.staticclass.Singleton obj7 = com.designpattern.singleton.staticclass.Singleton.getInstance();
        com.designpattern.singleton.staticclass.Singleton obj8 = com.designpattern.singleton.staticclass.Singleton.getInstance();
        System.out.println(obj7==obj8);
    }
}
