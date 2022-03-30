package com.designpattern.singleton.enums;

public class Singleton {
    //私有化构造函数
    private Singleton() {
    }

    //定义一个静态枚举类
    static enum SingletonEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private Singleton instance;

        //私有化枚举的构造函数
        private SingletonEnum() {
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;
        }
    }

    //对外暴露一个获取对象的静态方法
    public static Singleton getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}