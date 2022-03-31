package com.designpattern.observer;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 12:56
 * @Description: com.designpattern.observer
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.register(observer1);
        subject.register(observer2);
        subject.notify(new Message("200","成功"));
    }
}
